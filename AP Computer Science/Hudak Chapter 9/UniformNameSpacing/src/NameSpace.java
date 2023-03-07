		import java.util.Scanner;
		
public class NameSpace {

										// Jeffrey Hudak \\
   // ~ Takes a person's name input and removes the comma between the names but adds a space ~ \\
	
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner (System.in);
		System.out.println("Hello! All I want is your name! No credit card information. No Social Security.");
		System.out.println("Dont judge! I just really like to collect various names!");
		System.out.println("Please print your name below.");
		System.out.println("(In the foramt Last Name, First Name)");
		String fullName = keyb.nextLine();
		
		// Asks for the user's first name and last name (thats it) with a comma between the two
		
		int comma = fullName.indexOf(',');
		
		// Finds the location of the comma in the typed-out string
		
		String lName = fullName.substring(0, (comma));
		String fName = fullName.substring(comma+1);
		String fNameFix = fName.trim();
		
		// Makes the last name all characters from the comma back and the first name all characters after the comma
		
		System.out.print(fNameFix + " " + lName);
	}

}
