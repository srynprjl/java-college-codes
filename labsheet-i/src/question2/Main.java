package question2;

import java.util.Scanner;

//Write a program in Java to ask number of quantities and price for per quantity then find total price.
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of quantities: ");
		int noQ = scanner.nextInt();
		System.out.println("Price per unit: ");
		double price = scanner.nextDouble();
		
		double total = price*noQ;
		
		System.out.println("The total price is " + total + " NRs");
		scanner.close();
	}
}
