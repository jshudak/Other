# Dependencies ####
install.packages("data.table")
install.packages("openxlsx")

# Imports ####
library(data.table)
library(openxlsx)

# Data Importing and Cleaning ####

# Importing Data
# https://www.kaggle.com/jessemostipak/college-tuition-diversity-and-pay?select=salary_potential.csv
tuitionData <- read.csv(file.choose())
salaryData <- read.csv(file.choose())

# Remove NAs from Data
tuitionData <- na.omit(tuitionData)
salaryData <- na.omit(salaryData)

# Fix Salary Data State Name
names(salaryData)[names(salaryData) == "state_name"] <- "state"
salaryData$state <- gsub("-", " ", salaryData$state)

# Merge and Select Columns for Final Data Table
finalData <- merge(tuitionData, salaryData, by=c("name", "state"))
drops <- c("rank", "make_world_better_percent", "stem_percent")
finalData <- finalData[ , !(names(finalData) %in% drops)]

# Choose Variables ####

# X
x<-"out_of_state_total"
xLabel<-"Total Cost of Attendance (Out of State, $)"

# Y
y<-"early_career_pay"
yLabel<-"Early Career Pay ($)"

# Analysis of Variables ####

# Histogram - X
hist(finalData[[x]],
     main=paste0("Hist. of ", xLabel),
     xlab=xLabel)

# Boxplot - X
xOutliers <- boxplot(finalData[[x]],
                     main=paste0("Boxplot of ", xLabel),
                     xlab=xLabel)

# Identify Outliers - X
if (length(xOutliers$out)>0) {
  print("X Outliers:")
  xOutlierTable<-finalData[is.element(finalData[[x]], xOutliers$out),]
  print(xOutlierTable[,c("name", x)])
}

# Histogram - Y
hist(finalData[[y]],
     main=paste0("Hist. of ", yLabel),
     xlab=yLabel)

# Boxplot - Y
yOutliers <- boxplot(finalData[[y]],
                     main=paste0("Boxplot of ", yLabel),
                     xlab=yLabel)

# Identify Outliers - Y
if (length(yOutliers$out)>0) {
  print("Y Outliers:")
  yOutlierTable<-finalData[is.element(finalData[[y]], yOutliers$out),]
  print(yOutlierTable[,c("name", y)])
}

# Descriptive Statistics ####

# Create a Data Frame to Hold Statistics
xStatistics <- data.frame("Min"=numeric(), 
                          "1st Qu."=numeric(), 
                          "Median"=numeric(),
                          "Mean"=numeric(),
                          "3rd Qu."=numeric(),
                          "Max"=numeric(),
                          "Lower 95% C.I."=numeric(),
                          "Upper 95% C.I."=numeric(),
                          stringsAsFactors=FALSE) 
yStatistics <- data.frame("Min"=numeric(), 
                          "1st Qu."=numeric(), 
                          "Median"=numeric(),
                          "Mean"=numeric(),
                          "3rd Qu."=numeric(),
                          "Max"=numeric(),
                          "Lower 95% C.I."=numeric(),
                          "Upper 95% C.I."=numeric(),
                          stringsAsFactors=FALSE) 

# Generate List of Descriptive Statistics
xSummary<-summary(finalData[[x]])
ySummary<-summary(finalData[[y]])
  
# Calculate Margin of Error for Sample
findME<-function(dataSample, confidence) {
  interval<-1-((1-confidence)/2)
  error<-abs(qt(interval,df=(length(dataSample)-1)))
  mError<-error*sd(dataSample)/sqrt(length(dataSample))
  return(mError)
}
  
# Finding X & Y 95% Confidence Interval Values
errorX<-findME(finalData[[x]], 0.95)
lowerXInterval<-mean(finalData[[x]])-errorX
upperXInterval<-mean(finalData[[x]])+errorX
  
errorY<-findME(finalData[[y]], 0.95)
lowerYInterval<-mean(finalData[[y]])-errorY
upperYInterval<-mean(finalData[[y]])+errorY

# Add Stats to the Statistics Data Frame
xStatsRow<-c(xSummary,
             list("Lower 95% C.I."=lowerXInterval,
                  "Upper 95% C.I."=upperXInterval))
xStatistics<-rbind(xStatistics, data.frame(xStatsRow))
yStatsRow<-c(ySummary,
             list("Lower 95% C.I."=lowerYInterval,
                  "Upper 95% C.I."=upperYInterval))
yStatistics<-rbind(yStatistics, data.frame(yStatsRow))

# Scatter Plot w/ Least Squares Regression & Pearson's R ####

comparisonStatistics<-data.frame("Correlation"=numeric(),
                                 "p Value"=numeric())

# Identify Outliers by Color
outlierColors<-(finalData[[x]] %in% xOutliers$out)*1 + 
  (finalData[[y]] %in% yOutliers$out)*3
outlierColors<-outlierColors + 1

# Scatter Plot of Data
plot(finalData[[x]],
     finalData[[y]],
     main=paste0(xLabel, " vs. ", yLabel),
     col=outlierColors,
     xlab=xLabel,
     ylab=yLabel,
     xlim=c(5000, 80000),
     ylim=c(30000, 90000))

# Plot Least Squares Line
mod<-lm(finalData[[y]]~finalData[[x]])
abline(coefficients(mod), lwd=2, lty=2, col="red")

# Correlation Test
cTest<-cor.test(finalData[[x]], finalData[[y]])

# Extract and Format Correlation
correlation<-cTest$estimate
niceCor<-as.character(format(round(correlation, 4), nsmall = 4))
legend("topleft", 
       paste0("c = ", niceCor), 
       bty="n")

# Add Correlation and P-Value to  Statistics
correlationStats<- data.frame("Correlation"=correlation,
                              "p Value"=cTest$p.value)
comparisonStatistics<-rbind(comparisonStatistics, correlationStats)

# Write Region Statistics Out to a Excel File ####
fileName<-file.path("~", "Documents", "Undergrad", "Spring\ 2021", 
                    "MTH224", "Final\ Project", "projectStatistics.xlsx")
workBook <- createWorkbook()
addWorksheet(wb=workBook, sheetName=x)
addWorksheet(wb=workBook, sheetName=y)
if (length(xOutliers$out)>0) {
  addWorksheet(wb=workBook, sheetName="xOutliers")
  writeDataTable(wb=workBook, sheet="xOutliers", x=xOutlierTable)
}
if (length(yOutliers$out)>0) {
  addWorksheet(wb=workBook, sheetName="yOutliers")
  writeDataTable(wb=workBook, sheet="yOutliers", x=yOutlierTable)
}
addWorksheet(wb=workBook, sheetName="comparison")
writeDataTable(wb=workBook, sheet=x, x=xStatistics)
writeDataTable(wb=workBook, sheet=y, x=yStatistics)
writeDataTable(wb=workBook, sheet="comparison", x=comparisonStatistics)
saveWorkbook(wb=workBook, file=fileName, overwrite=TRUE)
