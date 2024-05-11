package question3;

import java.util.Scanner;

/*
 * Write a program in Java to input roll number, your college name and your name and display
it.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your roll number");
		int roll = scanner.nextInt();
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your college name: ");
		String college = scanner.nextLine();
		
		System.out.println("[ Roll: "+ roll + " Name: " + name + " College: " + college + " ]");
		scanner.close();
	}
}
