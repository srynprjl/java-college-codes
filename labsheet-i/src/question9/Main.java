package question9;

import java.util.Scanner;

/*WAP to read the age of three people then find average age.*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age of three people: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double avg = (a+b+c)/3;
		System.out.println("The average age is : " + avg);
		
		scanner.close();
	}
}
