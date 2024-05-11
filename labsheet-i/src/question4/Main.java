package question4;

import java.util.Scanner;

/*Write a program to read mark price of radio and find discount which is 30% of mark price
then find the actual selling price of radio*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marked price of the radio");
		double mp = scanner.nextDouble();
		double sp = (70/100)*mp;
		
		System.out.println("The selling price is " + sp);
		scanner.close();
	}
}
