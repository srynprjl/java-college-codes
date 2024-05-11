package question8;

import java.util.Scanner;

// Write a program to find the factorial of a given number.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int fact = 1;
        for(int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " +fact);

    }
}
