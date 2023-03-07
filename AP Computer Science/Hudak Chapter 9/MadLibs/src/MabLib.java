		import java.util.Scanner;
public class MabLib {
	
									// Jeffrey Hudak \\
				  // ~ Takes users' word inputs and produces a MadLib ~ \\
	
	public static void main(String[] args) {

		
		Scanner keyb = new Scanner (System.in);
		System.out.println("Mad Lib time! Just type out the type of words I ask you for :D\n");
		
		System.out.print("Adjective: ");
		String first = keyb.nextLine();
		
		// Asks the user for a type of word, then makes the word a string. Repeats as necessary
		
		System.out.print("Verb (with no suffix): ");
		String second = keyb.nextLine();
		System.out.print("Verb (with no suffix): ");
		String third = keyb.nextLine();
		System.out.print("Plural Noun: ");
		String fourth = keyb.nextLine();
		System.out.print("Adjective: ");
		String fith = keyb.nextLine();
		System.out.print("Personality: ");
		String sixth = keyb.nextLine();
		System.out.print("A place 1st-10th: ");
		String eigth = keyb.nextLine();
		System.out.print("Present Verb (-ing ending): ");
		String seventh = keyb.nextLine();
		System.out.print("Adjective: ");
		String nineth = keyb.nextLine();
		
		
		// Don't scroll down so you can't read it before you type out the answer
		
		
		
		
		
		
		System.out.println("\nMr.Zirkle is a " + first + " teacher. He lets us " + second + " and " + third + " all of the time in his class.");
		System.out.println("Sometimes he gives us " + fourth + " to mess around with. Some teachers would call it unsafe or inappropriate,");
		System.out.println("but we call it " + fith + ". His " + sixth + " nature, while it can be questionable at times, is what makes him");
		System.out.println("students' " + eigth + " favorite teacher. He forces me to help the other students while he is busy " + seventh + " himself");
		System.out.println("in the corner, but I dont really mind. Either way, his AP Comp Sci class is by far the most " +  nineth + " class of the day.");
		System.out.println("And its all thanks to Mr. Zirkle.");
		
		// Places the string variables where they fit in the story
	}

}
