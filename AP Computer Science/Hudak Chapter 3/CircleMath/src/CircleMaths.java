import java.util.Scanner;


public class CircleMaths {

	public static void main(String[] args) {
		Scanner keyb = new Scanner (System.in);
		double rad;
		
		// Creates a scanner to read the keyboard strokes
		// and variables for the radius the person will input
		// as well as the conversion factors
		
		System.out.println("Hello! I am here to help you with your geometry homework!");
		System.out.println("What is the radius of your sphere?");
		rad = keyb.nextDouble();
		
		// Asks for the person's radius and awaits their input
		
		System.out.println("Thank you! Here are its various attributes:");
		System.out.println("Diameter = " + rad*2);
		System.out.println("Circumference = " + rad*2*Math.PI + " units\u00B2");
		System.out.println("Volume  = " + rad*rad*rad*(4.0/3.0)*Math.PI + " units\u00B3");
		System.out.println("Surface Area = " + rad*rad*4*Math.PI + " units\u00B2"); 
		
		// Prints out the various conversions along
		// with whether the units are squared or cubed
	}

}
