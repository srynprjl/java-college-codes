package question1;
//Write a program to take name of player who has won Ballon dor and golden
//boot and display no of Ballon dor and golden boot won by the player using
//switch statement.

import java.util.Scanner; // imporing Scanner from java.utils

public class Main {

	public static void main(String[] args) {
		// making a scanner object
		Scanner scanner = new Scanner(System.in);
		
		// taking an input
		System.out.print("Enter a player who has won Ballon d'or and golden boot: ");
		String playerName = scanner.nextLine().toLowerCase(); // toLowerCase() converts into lowercase
		
		
		// making a decision statement
		switch(playerName) {
			case "messi": //checking the user input
				// printing if input matches
				System.out.println("Ballon Dor: 6");
				break;
			case "ronaldo":
				System.out.println("Ballon Dor: 5");
				break;
			default:
				System.out.println("Player not in database");
				break;
		}
		// closing the scanner object
		scanner.close();
	}

}
