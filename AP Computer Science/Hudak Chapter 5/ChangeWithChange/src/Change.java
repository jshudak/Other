		import java.util.Scanner;
public class Change {

	public static void main(String[] args) 
	{
		
		Scanner keyb = new Scanner(System.in);
		double money;
		int quarters, dimes, nickels;
		
		System.out.println("Figuring out the specific and amount of coins someone's change is off");
		System.out.println("the top of you head is SO yesterday. Instead, you can use this");
		System.out.println("program and save yourself the mental headache at the cost of taking");
		System.out.println("taking an aditional 30 seconds!\n");
		
		System.out.println("Please type the amount of change below!");
		System.out.print("Change is...");
		money = keyb.nextDouble();
		
		// Explains the program to the user, then asks them for their change amount
		
		money = money*100;
		
		// Multiplies the change by 100 because I did not want to deal with decimal math
		// and add decimal points to my code later
		
		System.out.print( (int) (money/25) + " Quarter(s) ");
		quarters = (int) (money/25);
		
		// Divides the money by 25, the amount worth of a quarter, and prints out
		// the remainder (I now see I could have used modulus). The program
		// then does that same math to actually be aware of the number it printed
		// off and save that as the number of quarters.
		
		System.out.print( (int) ((money-(quarters*25))/10) + " Dime(s) ");
		dimes = (int) ((money-(quarters*25))/10);
		
		// Takes the base change amount, subtracts the quarters (however many quarters
		// times 25 cents per quarter) and then calculates dimes. Does that same math 
		// to then calculate how many dimes to save into the system. Repeat for nickels
		// and pennies.
		
		System.out.print( (int) ((money-((quarters*25)+(dimes*10)))/5) + " Nickel(s) ");
		nickels = (int) ((money-((quarters*25)+(dimes*10)))/5);
		
		System.out.print( (int) ((money-((quarters*25)+(dimes*10)+(nickels*5)))) + " Penny(ies) ");
	}

}
