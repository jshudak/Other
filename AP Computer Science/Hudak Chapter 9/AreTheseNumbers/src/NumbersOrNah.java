		import java.util.Scanner;
public class NumbersOrNah {

									// Jeffrey Hudak \\
	   // ~ Prints out the mathematical answer of two divided numbers rounded to two places ~ \\
	
	public static void main(String[] args) 
	{
		Scanner keyb = new Scanner (System.in);
		System.out.println("If for whatever reason you cannot see if you typed in a character or not");
		System.out.println("then this is the program for you! Obviously this is used in addition to other");
		System.out.println("programs, but this one isnt. This is it.");
		System.out.print("Type in whatever here: ");
		String str = keyb.nextLine();
		int testnum = 0;
		
		// Asks the user for an input, and sets that as a string. Makes a 'testnum' for later uses.
		
		try
		{
			testnum = Integer.parseInt(str);
				if (testnum == 0)
				{testnum =1;}
		}
		
		// Attempts to set 'testnum' to the string input. If the input was 0, changes it to 1 so the program works
		
		catch (NumberFormatException ex)
		{System.err.println("Input contains non-number characters.");}
		
		// If the input was unable to be converted - if it has characters - print an error
		
		finally
		{
			if (testnum > 0 || testnum < 0)
			{System.out.print("The input was all numbers!!");}
		}
		
		// Tells the user their input was a number, only assuming that the inital input was only numbers

	}

}
