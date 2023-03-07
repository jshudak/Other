		import java.util.Scanner;
		
public class IsItaLeapYear {

	public static void main(String[] args) {
		Scanner keyb = new Scanner (System.in);
		double year;
		
		System.out.println("Leap years are confusing and messy if you don't understand");
		System.out.println("the rules, and instead of googling it you somehow came upon");
		System.out.println("this fancy program to do it for you! Put in any year");
		System.out.println("and I will tell you if it is or isnt a leap year.\n");
		
		System.out.println("Please type out your year below!");
		System.out.print("The year...");
		year = keyb.nextDouble();
		
		// Explains the program to the user and asks for their desired years
		
		if (year<=0)
		{
			
			System.out.println("Years below and at 0 certianly did not use leap years");
			System.out.println("- tecnhcially they didnt start until the mid 1700s -");
			System.out.println("so I would have to determine that any of these years");
			System.out.println("would not be a leap year.");
			
		}
		else if (((year%4.0)==0) && ((year%100)==0) && ((year%400)==0))
			System.out.print("...is a leap year!");
		
		// Calculates if the number is evenly divisible by 0, 100, and 400.
		// If all those calculate true, then it tells the person the year is a leap year.
		
		else if (((year%4.0)==0) && ((year%100)!=0))
			System.out.print("...is a leap year!");
		
		// Used to calculates the dates between centuries by seeing
		// if the number can be divisible by 4 - how often a leap year occurs - 
		// the computer tells the person it is a leap year.
		
		else
			System.out.print("...is not a leap year.");
		
		// If none of the statements are true, the year is not a leap year.
		

	}

}
