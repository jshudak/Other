	import java.util.Scanner;
	
public class P_or_N {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		
		double number;
		System.out.println("I am a program that deals with numbers but I would");
		System.out.println("not consider myself a calculator! All I am here for ");
		System.out.println("is to determine whether a number is positive or negative.\n");
		System.out.println("Please type in your desired number below");
		System.out.print("My number is...");
		number = keyb.nextDouble();
		
		if (number>0)
			System.out.println("Your number is positive!");
		
		// If the number is above zero, it is positive.
		
		else if (number == 0)
		{
			System.out.println("Zero is a complicated number that may be either positive");
			System.out.println("or negative. Because zero means a lack of anything, it is hard");
			System.out.println("for even me to determine which it is.");
		}
		
		// Zero is complicated...
		
		else
			System.out.println("Your number is negative!");
		
		//If the number is not zero or above zero, it is negative.
		
	}

}
