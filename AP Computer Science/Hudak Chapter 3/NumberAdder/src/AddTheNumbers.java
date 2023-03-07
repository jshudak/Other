import java.util.Scanner;


public class AddTheNumbers {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner (System.in);
		int num, ones, tens, hundreds, thousands;
		
		// Creates integer variables for the number the person
		// inputs, as well as to store the integer values
		// for all four places of the number
		
		System.out.println("Mr.Zirkle thought this was hard, so I will make it easy for you!");
		System.out.println("Any number - 0 to 9999 - I will add the integers together for a final result");
		System.out.println("Put any number below for me to calculate.");
		System.out.print("Please type the number of your choice = ");
		num = keyb.nextInt();
		
		// Simply explains the program to the user, and
		// asks them to input a number that the program and handle
		
		System.out.println("Here is all those pesky integers added together. You're welcome :D");
		ones = num%10;
		num /= 10;
		tens = num%10;
		num /= 10;
		hundreds = num%10;
		num /= 10;
		thousands = num%10;
		num /= 10;
		
		// Reads the first value of the number - the ones place -
		// and stores that as the ones place. Then it divides
		// the number by 10, and reads the new first value -
		// the tens place - and stores that as tens. Repeats two other
		// times, then adds all the place values together.
		
		System.out.print(ones+tens+hundreds+thousands);
		
		
		
		
		

	}

}
