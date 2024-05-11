package question7;

import java.util.Scanner;

/*& WAP to read basic salary then find tax and allowance, tax is 20% of basic salary and
allowance is 40% of basic salary. Also find out net salary.*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		double basic = scanner.nextDouble();
		double tax = (20/100)*basic;
		double allowance = (40/100)*basic;
		double netSalary = basic + allowance - tax;
		
		System.out.println("The net salary is " + netSalary);
		scanner.close();

	}
}
