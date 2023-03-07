import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		String firstname;
		Scanner keyb = new Scanner (System.in);
		System.out.println("Hello!! What is your name?");
		firstname = keyb.nextLine();
		System.out.print("Thats a nice name " + firstname + "!");
	}

}
