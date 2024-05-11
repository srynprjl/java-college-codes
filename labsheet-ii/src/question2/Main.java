package question2;

/*
WAP to find following using if..else..if and switch statement:
	1. Area of rectangle.
	2. Simple Interest.
	3. Volume of Cube
*/

import java.util.Scanner; // imporing Scanner from java.utils

public class Main {
	
	
	// creating fucntions for each class
	static int areaRectangle(int l, int b) {
		return l*b;
	}
	
	static float simpleInterest(int p, int t, int r) {
		return (p*t*r)/100;
	}
	
	static int volumeCube(int l) {
		return (int) Math.pow(l, 3);
	}

	public static void main(String[] args) {
		//creating a scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a choice:");
		System.out.println("1. Area of rectangle");
		System.out.println("2. Simple Interest");
		System.out.println("3.Volume of Cube");
		//taking user choice of what they what to do
		int choice = scanner.nextInt();
		
		//checking the user choice
		if(choice == 1) {	
			System.out.println("Enter the length: ");
			int l = scanner.nextInt();
			System.out.println("Enter the breadth: ");
			int b = scanner.nextInt();
			//calling the rectangle area function passing l and b as argument
			System.out.println("The area of rectangle is: " + areaRectangle(l,b));
		} else if(choice == 2) {
			System.out.println("Enter the principal: ");
			int p = scanner.nextInt();
			System.out.println("Enter the rate: ");
			int r = scanner.nextInt();
			System.out.println("Enter the time period: ");
			int t = scanner.nextInt();
			
			System.out.println("The simple interest is: " + simpleInterest(p,t,r));
			
			
		} else if(choice == 3){
			System.out.println("Enter the length of cube: ");
			int l = scanner.nextInt();
			System.out.println("The volume of cube is: " + volumeCube(l));
		} else {
			System.out.println("Invalid choice");
		}
		
		scanner.close();
		
	}
	

	

}
