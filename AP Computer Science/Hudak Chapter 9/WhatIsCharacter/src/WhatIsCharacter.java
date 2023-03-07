		import java.util.Scanner;
public class WhatIsCharacter {
	
										// Jeffrey Hudak \\
	  // ~ Tells a user if the character they entered is a number, letter, or a white space ~ \\
	
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner (System.in);
		System.out.println("I have NO idea why you just downloaded this program. Seriosuly.");
		System.out.println("You HAVE to know what youre typing in, just look at what you typed!!");
		System.out.println("But whatever. I guess you wanted this. Please type in a single character.");
		System.out.println("I will be able to determine whetheryou typed a charcter, number, or a space");
		System.out.println("If you type out more than one character, it will read the first character.");
		System.out.print("Please type your characrer here: ");
		String in = keyb.nextLine();
		char input = in.charAt(0);

		// Tells the user that this program is really, really silly to use.
		// Then asks for and records a character.
		
		boolean isD = Character.isDigit(input);
		boolean isL = Character.isLetter(input);
		boolean isS = Character.isWhitespace(input);
		
		if (isD == true)
		{System.out.print("Your character is a numerical digit.");}
		
		else if (isL == true)
		{System.out.print("Your character is a letter.");}
		
		else if (isS == true)
		{System.out.print("Your character is just a space. Nice try.");}
		
	}

}
