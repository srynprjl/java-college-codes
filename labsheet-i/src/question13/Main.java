package question13;

import java.util.Scanner;

/*
The distance between two places is input through keyboard in meter. WAP to convert meter
into centimeter and again convert into inch.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the distance between two places in meter: ");
		int m = scanner.nextInt();
		int cm = m*100;
		double in = cm/2.54;
		
		System.out.println("The converted in cm: " + cm);
		System.out.println("The converted in cm: " + in);		
		scanner.close();
	}
}
