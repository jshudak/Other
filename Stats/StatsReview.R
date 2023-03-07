(1) A life insurance salesman sells on the average 3 life insurance
 policies per week. Use Poisson's' distribution to calculate the 
 probability that in a given week he will sell

(a) At least one policy.
  1 - ppois(0,3)
  
(b) 2 or more policies but less than 5 policies.
# All numbers up to 5 - (0 && 1)
  ppois(4, 3) - ppois(1, 3)
  
(c) What is the standard deviation of the number of life insurance policies sold per week?
  sqrt(var) >> sqrt(lamda) >> sqrt(3)
  
(d) Assuming that there are 5 working days per week, what is the probability that in a given day he will
 sell one policy?
# Odds of exactly one on a single day of the 5 day work week
  dpois(1, (1/5)*3)


(2) 60% of people who purchase sports cars are men. If 10 sports car 
 owners are randomly selected, find the
 probability that exactly 7 are men.
# They either have it or dont, with replacement. 
  dbinom(7, 10, .6)


(3) Vehicles pass through a junction on a busy road at an
average rate of 300 per hour

(a) Find the probability that none passes in a given minute.
# Cars are not continuous, so poisson dist. 1 minute is 1/60 an hour
  dpois(0, (1/60)*300)
(b) What is the expected number passing in two minutes?
# 300 in an hour >> 300 cars in * (2/60) minutes
    300*(1/30)
(c) Find the probability that this expected number actually pass 
 through in a given two-minute period.
 dpois(10, (1/30)*300)
 
 
(4) The likelihood that a patient with a heart attack dies of the
 attack is 0.04 (i.e., 4 of 100 die of the attack).
 Suppose we have 25 patients who suffer a heart attack.
 
(a) What is the probability that all will survive?
#Key word is SURVIVE, so the prob is flipped
  dbinom(25, 25, .96)
(b) What is the probability that no more than 1 person dies of the heart attack?
   pbinom(1, 25, .04)
(c) What is the expected value of patients who die of the attack?
#Mean == n*p
   25 * .04
(d) What is the standard deviation of patients who die of the attack?
#Var = n*p*(1-p)  >>  std = sqrt(VAR)
   sqrt(25 * .04 * .96)
 
 
(5) Suppose the average number of lions seen on a 1-day safari is 5.
 What is the probability that tourists will
 see fewer than four lions on the next 1-day safari?
# Average 5 over a time span of one day - poisson dist
   ppois(3, 5)
 
 
(6) You are surveying people exiting from a polling booth and asking
 them if they voted independent. The probability that a person voted
 independent is 20%. What is the probability that 15 people must be
 asked before you can find 5 people who voted independent?
# Looking for n'th thing >> negative binomial
# Remember, it goes failures, successes, prob (f + s = total)
   dnbinom(10, 5, .2)
   
 
(7) During a particular period a universitys information technology
 office received 20 service orders for problems
 with printers, of which 8 were laser printers and 12 were inkjet
 models. A sample of 5 of these service orders
 is to be selected for inclusion in a customer satisfaction survey
 What then is the probability that exactly
 two of the selected service orders were for inkjet printers?
#Without replacement >> hypergeometric. Do actual math
(choose(12, 2)*choose(8, 3))/choose(20, 5)
   
 
(8) 5 individuals from an animal population thought to be near
 extinction in a certain region have been
 caught, tagged, and released to mix into the population. After
 they have had an opportunity to mix, a
 random sample of 10 of these animals is selected. Let X= the number
 of tagged animals in the second
 sample. If there are actually 25 animals of this type in the region,
 what is the E[X] and V ar[X] if the
 sampling was carried out without replacement?
#Without repacement >> hypergeometric
   
# Looking for the original 5 in the new group of 10 out of 25 total
  Ex..
   (5*10)/25
# n = total pulled, N = Total, k = what we're looking for
  Varx..
    (20/24)*10*(5/25)*(15/25)
 

(9) Lebron is a 70% free throw shooter. That means his probability
 of making a free throw is 0.70. During the
 season, what is the probability that Lebron makes his third free
 throw on his fifth shot?
# n'th something >> negative binomial
# Two failures, three successes, 70%
   dnbinom(2, 3, .7)
 
 
(10) Products produced by a machine has a 3% defective rate.
 
 (a) What is the probability that the first defective occurs in
 the fifth item inspected?
# First defective >> geometric
# dgeom needs (x-1, prob)
   dgeom(4, .03)
 
 (b) What is the probability that the first defective occurs in
 the first five inspections?
   pgeom(4, .03)
 
 (c) What is the expected number of inspections before the first
 defective occurs?
# Expected number is mean
   1/.03
 
 
(12) Suppose a flight is about to land and the announcement says
 that the expected time to land is 30 minutes.
 You can assume that the flight landing follows a Uniform
 Distribution on the time interval [0,30]. Find the
 probability of getting flight land between 25 to 30 minutes?
# Uniform, visualize rectangle. Looking for 5 specific minutes that
# span a total of 30 minutes
   5/30
 
 
(13) Suppose a train is delayed by anywhere between 0 and 60 minutes.
 (a) What is the probability that train will reach by
 57 minutes to 60 minutes?
   3/60
  (b) How long do you expect to wait?
# Find the mean
   (0 + 60)/2
 

(14) Accidents occur with a Poisson distribution at an average of
 4 per week.
 (a) Calculate the probability of more than 5 accidents in
 any one week
#'More than 5' is at least 5
  1 - ppois(5, 4)
  
  
(17) Suppose that X is a random variable with the mean 10
  and standard deviation 2. Find the following:
 (a) E[2X + 10]
  2E[X] + 10 >> 30
  
 (b) Var[2X + 10]
  4Var[X] >> 16
  
 (c) E[(X???10) / 2]
  (1/2)E[X] - (1/2)E[10] >> 0
  
 (d) Var[(X???10) / 2]
  (1/4)Var[X] >> 1
  

(18) Let X have a range [0, 2] and the density (3/8)x^2. Find E[X].
# Range but not stated uniform means basic continuous. E[X] = int(xfx)
  integrate(function(x) x * (3/8)*(x^2), 0, 2)
  
      
   
(19) We roll two standard 6-sided dice. You win $1000 if the sum
 is 2 and lose $100 otherwise. How much do you
 expect to win on average per trial?
# Remember rolling two dice is out of 36
   (1/36)*1000 - (35/36)*100
 

(20) Let X be the value of a roll of one die and let Y = x^2.
 Find E[Y]
#Add all possible values divided by odds
 (1+4+9+16+25+36)/6
 also
 1*(1/6) + 4*(1/6) + 9*(1/6) + 16*(1/6) +25*(1/6) +36*(1/6)
 
 
(21) Let X be a continuous random variable with the probability
 distribution function f(x) = (x^3) / 4
 on 0 < x < c.
 What is the value of the constant that makes f(x) a valid
 probability function?
# PDF has to equal 1, so..
  integral(0, c) (x^3) / 4  == 1
  (1/4)integral(0, c) x^3 == 1
  (1/4) * ((c^4)/4 - 0^4) == 1
  (c^4)/4 = 4
  c^4 = 16
  c == 2
  
 Find the expected value and the standard deviation of X
  E[x] = int(x * f(x)) = 1/4 int(x^4)
   integrate(function(x) x * ((x^3)/4), 0, 2)
   
  std = sqrt(Var) = sqrt(E[X^2] - E[X]^2)..
   sqrt( integral(x^2 * f(x)) - (8/5)^2)
      sqrt( 1/4 int(x^5) - 64/25) = sqrt(1/24(2^6) - 64/25)
 
      
(22) Let X denote the time between detections of a particle.
 Suppose detections of a particle follow a Poisson
 process with an average rate of occurrence of 10 detections
 every 14 minutes
 
 (c) What is the probability that exactly nine particles
 will be detected in 14 minutes?
  dpois(9, 10)
   
 (d) What is the probability that at least nine particles
 will be detected in 14 minutes?
   1 - ppois(8, 10)
   
 (e) What is the probability that at most five particles will
 be detected in 7 minutes?
   ppois(5, 5)
   
 (f) Generate a histogram plot of the pmf of particle
 detections in 7 minutes.
 x <- c(0:20)
 plot(x, dpois(x, 5), type='h')
 
 (g) Generate a line plot of the cdf of particle
 detections in 7 minutes.
 plot(x, ppois(x, 5), type="l")
 
 
(23) Suppose that X is a binomial random variable with n = 25
 and p = 0.8. Generate a histogram plot of the pmf
  x <- c(0:25)
  plot(x, dbinom(x, 25, .8), type="h")
  
  
(24) Let X be a continuous random variable whose 
  probability density function is f(x) = 3x^2, 0 < x < 1.
  (a) Find the probability that X is at least 1/2.
#No idea
  xfx <- function(x) 3*x^2
  integrate(function(x) 3*x^2, (1/2), 1)
  
  (b) Find E[X].
# The integral from 0 to 1 of x * f(x)
  integrate(function(x) x * 3*x^2, 0, 1)
  
  (c) Find E[2X].
  2E[X] = 3/2
  
  (d) Find E[3X ??? 2].
  3E[X] - 2 = 1/4
  
  (e) Find E[X^2].
  integrate(function(x) (x^2) * 3*x^2, 0, 1)
  
  (f) Find VAR[X].
  E[X^2] - E[X]^2..
    3/5 - (9/16)
  
  (g) Find VAR[X ??? 2].
  = Var[x]
  
  (h) Find VAR[3X].
  9 * Var[X]
    9*(3/5-(9/16))

          