package question6;

import java.util.Scanner;

// Write Java program to check if a number is palindrome.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int newNum = num;
        int dig = 0, rev = 0;
        while(newNum > 0){
            dig = newNum % 10;
            rev = rev * 10 + dig;
            newNum /= 10;
        }

        if(num == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
