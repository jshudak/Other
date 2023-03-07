	import java.util.Scanner;
public class EliminateDashes {
	
									// Jeffrey Hudak \\
		   // ~ Eliminates dashes within a social security number (or any number) ~ \\
	
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner (System.in);
		System.out.println("Hello! I am a generic program that deals with Social Security Numbers!");
		System.out.println("All I do is remove dashes within a SS number.");
		System.out.print("Please type your SS with dashes included:");
		String SSNum = keyb.next();
		
		String SSNum1 = SSNum.substring(0,3);
		String SSNum2 = SSNum.substring(4,6);
		String SSNum3 = SSNum.substring(7,11);
		
		// Reads the first three, then next two, then next four numbers from the SSN and
		// makes them separate strings. Then prints out below \/ \/ \/
		
		System.out.print(SSNum1 + SSNum2 + SSNum3);
		

	}

}
