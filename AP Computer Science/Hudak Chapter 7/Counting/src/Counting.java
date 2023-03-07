		import java.util.Scanner;
public class Counting {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int num, k;
		System.out.print("Num:");
		num = keyb.nextInt();
		
		// Takes the users input and assigns that to 'num'
		
		for (k=1;k<=10;k+=1)
		{System.out.print(num*k + " ");}
		
		// Assigns k to 1, and for as long as k is less than or equal to 10 (so it repeats 10 times)
		// print out the users input times how many times the loop is run.

	}

}
