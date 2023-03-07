import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner keyb = new Scanner (System.in);
		double speed;
		final double MPS_CONVERT = .447;
		final double KPH_CONVERT = 1.609;
		
		// Creates a scanner to read the keyboard strokes
		// and variables for the speed the person will input
		// and constants for the conversion factors
		
		System.out.println("What speed in mph would you like me to convert?");
		speed = keyb.nextDouble();
		System.out.println("Here are your speeds converted! You're Welcome :D");
		System.out.println(speed*KPH_CONVERT + " km/hr");
		System.out.println(speed*MPS_CONVERT + " m/s");
		
		// After politely asking for the speed, it politely returns
		// the results with a smile

	}

}
