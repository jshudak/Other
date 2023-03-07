import java.util.Scanner;

public class WageCalculator {

	public static void main(String[] args) {
		Scanner keyb = new Scanner (System.in);
		double wage, hours, overHours, pay;
		final double OVERTIME_DIF = 1.5;
		
		// Creates a scanner to read the keyboard strokes
		// and variables for the employee's wage, hours, their pay
		// overtime hours, and a conversion factor for overtime hours
		
		System.out.println("What is up my guy! Why do the work to calculate wage when I can do it instead?");
		System.out.println("Just input all the information - wage, hours, and overtime hours - and I'll do the rest.");
		System.out.println("First, what is the person's wage?");
		System.out.print("Wage = $");
		wage = keyb.nextDouble();
		
		// Asks for the hourly wage of the specific person
		// and sets the wage variable to equal that
		// works with an integer (like 8) or a decimal (8.25)
		
		System.out.println("Next, how many NORMAL hours they worked:");
		System.out.print("Total NORMAL hours = ");
		hours = keyb.nextDouble();
		pay = wage*hours;
		
		// Does the same as wage but with their hours,
		// then calculates the pay without overtime hours.
		
		System.out.println("Last, their overtime hours, if any:");
		System.out.print("Total overtime hours = ");
		overHours = keyb.nextDouble();
		pay = pay + (wage*OVERTIME_DIF*overHours);
		
		// It calculates how much the employee should be paid
		// accounting for the added overtime bonus, and then
		// adds that to the pay variable to get a final result.
		
		System.out.print("Your employee made "); 
		System.out.printf("$%.2f", pay);
		System.out.print(" this week.");
		
		// Displays the final pay result in dollars and cents
		// for the user's convenience.

	}

}
