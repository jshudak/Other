		import java.util.Scanner;
		
public class Counting_Didgets {

	public static void main(String[] args)
	{
		
		double num;
		Scanner keyb = new Scanner (System.in);
		
		System.out.println("Couting a string of what seems like a million or so digits");
		System.out.println("is wayyy too much work for anyone to do, so I'll do it instead!");
		System.out.println("Any number under 10-billion I can determine the total number of");
		System.out.println("digits it has!\n");
		
		System.out.println("Please type out your number below!");
		System.out.print("My number is...");
		num = keyb.nextDouble();
		
		// Explains what the program does and asks the user to type in their number.
		
		if (0<=num && num<10)
			System.out.println("The numebr only has one didgit.");
		
		// Reads the number and sees if it lies between two specified numbers
		// - in this case a number with one digit and two - and if it does then
		// prints that the number has one digit. This repeats for all other
		// amount of digits up to 10, from where the system fails due to Java limitations.
		
		else if (num>=10 && num<100)
			System.out.println("The number has two didgits.");
		
		else if (num>=100 && num<1000)
			System.out.println("The number has three didgits.");
		
		else if (num>=1000 && num<10000)
			System.out.println("The number has four didgits.");
		
		else if (num>=10000 && num<100000)
			System.out.println("The number has five didgits.");
		
		else if (num>=100000 && num<1000000)
			System.out.println("The number has six didgits.");
		
		else if (num>=1000000 && num<10000000)
			System.out.println("The number has seven didgits.");
		
		else if (num>=10000000 && num<100000000)
			System.out.println("The number has eight didgits.");
		
		else if (num>=100000000 && num<1000000000)
			System.out.println("The number has nine didgits.");
		
		else
			System.out.println("The number has ten or more didgits.");
	}

}
