package question10;

import java.util.Scanner;

/*
 * WAP to convert meter into centimeter, hours into minutes,Rupees into Dollars.
 */
public class Main {

	static double convertMeter(double m) {		
		return m*100;
	}
	
	static double convertHours(double h) {
		return h*60;
	}
	static double convertRupees(double rs) {
		return rs/133.6;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter what you want to convert: ");
		System.out.println("1. Meter to Centimeter");
		System.out.println("2. Hours to Minute");
		System.out.println("3.Rupees to Dollars");
		int option = scanner.nextInt();
		switch(option) {
		case 1:
			System.out.print("Enter the unit in m: ");
			int m = scanner.nextInt();
			System.out.println("The converted unit is " + convertMeter(m) );
			break;
		case 2:
			System.out.print("Enter the unit in hrs: ");
			int hrs = scanner.nextInt();
			System.out.println("The converted unit is " + convertHours(hrs) );
			break;
		case 3:
			System.out.print("Enter the amount in Rs: ");
			int rs = scanner.nextInt();
			System.out.println("The converted unit is " + convertRupees(rs) );
			break;
		default:
			break;
		}
		scanner.close();
	}
	
	

}
