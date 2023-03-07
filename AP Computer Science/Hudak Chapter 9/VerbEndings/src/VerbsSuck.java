		import java.util.Scanner;
public class VerbsSuck {

									// Jeffrey Hudak \\
		    // ~ Adds the correct ending to verbs to make them present tense ~ \\
	
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner (System.in);
		System.out.println("The english language sucks and has a lot of rules to remember.");
		System.out.println("Although I do not follow all of them, I can remove 'e's from words!");
		System.out.print("Please input a verb:");
		String inVerb = keyb.next();
		String outVerb = null;
		
		// Asks the user for a verb and sets the output (outverb) as blank for now
		
		int length = inVerb.length();
		
		if (inVerb.lastIndexOf('e')==3)
			outVerb = inVerb.substring(0,3) + "ing";
		else if (inVerb.lastIndexOf('e')==4)
			outVerb = inVerb.substring(0,4) + "ing";
		else if (inVerb.lastIndexOf('e')==5)
			outVerb = inVerb.substring(0,5) + "ing";
		else if (inVerb.lastIndexOf('e')==6)
			outVerb = inVerb.substring(0,6) + "ing";
		else if (inVerb.lastIndexOf('e')==7)
			outVerb = inVerb.substring(0,7) + "ing";
		
		// If the verb ends in an e, finds how long the verb is and deletes the 'e', then adds ing
		
		else
			{outVerb = (inVerb + "ing");}
		
		// If its a normal verb, just adds 'ing' Then prints out the final verb.
		
		System.out.print(outVerb);
	}

}
