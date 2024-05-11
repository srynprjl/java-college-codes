	package question12;

import java.util.Scanner;

/*
 * WAP to input four digits number then find its reverse.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a 4 digit number: ");
		int n = scanner.nextInt();
		while(n <= 999 || n>=10000) {
			System.out.print("Enter a 4 digit number: ");
			n = scanner.nextInt();
		}
		int dig = 0;
		int rev = 0;
		while(n != 0) {
			dig = n % 10;
			rev = rev*10+ dig;
			n/=10;
		}
		
		System.out.println("The reversed number is: " + rev);
		scanner.close();
	}

}
