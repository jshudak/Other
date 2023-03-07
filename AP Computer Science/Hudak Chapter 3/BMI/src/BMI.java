import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner keyb = new Scanner (System.in);
		double weight, height, BMI;
		final double KILO_CONVERT = 0.453592;
		final double METER_CONVERT = 0.0254;
		
		// Creates a scanner to read the keyboard strokes
		// and variables for the person's height, weight, end BMI,
		// as well as the conversion factors

		System.out.println("Aloha! Calculating BMI can be a struggle, thats why I am here to help!");
		System.out.println("All I need is your weight in pounds and inches.");
		System.out.println("First, please type your weight below in pounds:");
		weight = keyb.nextDouble();
		weight *= KILO_CONVERT;
		
		// Asks for the person's weight in pounds
		// the computer reads the input, and then immediately
		// converts that number to kilograms using the constant
		
		System.out.println("Thank you! Now please type your height below in inches:");
		height = keyb.nextDouble();
		height *=METER_CONVERT;
		
		// Asks for the person's height in inches
		// the computer reads the input, and then immediately
		// converts that number to meters using the constant
		
		System.out.println("Perfect! Here is your calculated BMI:");
		BMI = weight / (height*height);
		System.out.printf("%.2f", BMI);
		
		// Correctly outputs the person's calculated BMI, rounded to two decimals
		
		
		

	}

}
