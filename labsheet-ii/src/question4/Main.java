package question4;

import java.util.Scanner;

//Write a program to take name of program from user and display elective
//subjects for the corresponding program as follows using switch statement
/*
 * 1. BCIS Mobile Computing, System administration(Linux,windows)
2. BBA-BI Micro finance, Investment Management
3. BBA Marketing, Finance
4. BBA-TT Travel insurance
5. WAP to process result of all students based on the specification stated
above.
 */

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String sub = scanner.nextLine().toLowerCase();
		
		switch(sub) {
		case "BCIS":
			System.out.println("Mobile Computing, System administrator (Linux, windows");
			break;
		case "BBA":
			System.out.println("Marketing, Finance");
			break;
		case "BBA-BI":
			System.out.println("Micro finance, Investment Management");
			break;
		case "BBA-TT":
			System.out.println("Travel insurance");
			break;
		}
		
		scanner.close();
	}

}
