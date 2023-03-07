		import java.text.DecimalFormat;
		import java.util.Scanner;
public class TrailingZeros {

									// Jeffrey Hudak \\
	   // ~ Prints out the mathematical answer of two divided numbers rounded to two places ~ \\
	
	public static void main(String[] args) 
	{
		Scanner keyb = new Scanner (System.in);
		DecimalFormat two = new DecimalFormat(".00");
		System.out.println("Dividing by mutiple numbers can be done by a calculator, but the result is so long!");
		System.out.println("I will divide any two numbers and print out the result rounded to two decimal places!");
		System.out.print("Your two numbers go here: ");
		double num = keyb.nextInt();
		double num2 = keyb.nextInt();
		
		// Tells users to type out two numbers, and saves those as the first and second number
		
		double maths = (num/num2);
		System.out.print("Answer: " + two.format(maths));
		
		// Divides the two numbers and rounds them to two decimal places

	}

}
