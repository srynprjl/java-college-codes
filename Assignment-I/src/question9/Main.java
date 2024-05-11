package question9;

import java.util.Scanner;
//Write a program to find the sum of square of digits of a given number.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int dig = 0, sum = 0;

        while(num > 0){
            dig = num % 10;
            sum += (int) Math.pow(dig, 2);
            System.out.println("Dig" + dig + " Sum: " + sum);
            num /= 10;
        }


        System.out.println("The sum is: " +sum);
    }
}
