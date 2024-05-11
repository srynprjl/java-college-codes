package question5;

import java.util.Scanner;

/*
 * WAP to add, subtract, multiply and divide the two numbers.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scanner.nextInt();
		System.out.println("Enter a number: ");
		int b = scanner.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		double div = a/b;
		System.out.println("The addition is: " + add);
		System.out.println("The subtraction is: "+ sub);
		System.out.println("The multiplication is: " + mul);
		System.out.println("The division is: " + div);
		scanner.close();
	}
}
