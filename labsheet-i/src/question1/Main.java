package question1;

import java.util.Scanner;

//Write a program to find square, cube and square root of given number.

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		double square = Math.pow(num, 2);
		double cube = Math.pow(num,3);
		double squareRoot = Math.sqrt(num);
		
		System.out.println("The square is : " + square);
		System.out.println("The cube is : " + cube);
		System.out.println("The square root is : " + squareRoot);
		
		scanner.close();
	}

}
