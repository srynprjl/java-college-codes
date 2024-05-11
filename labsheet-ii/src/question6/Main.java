package question6;

import java.util.Scanner;

/*
 * Write a program to read 10 integer number from user and do the following:
1. Find the largest number from the array.
2. Sort those element in ascending order.
3. Find the second largest number from the array.
 */

public class Main {
	static int[] arr = new int[10];
	
	static int largestNumber() {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	static void sortedArray() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	static void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	static int secondLargest() {
		int largest = arr[0];
		int secondLargest = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("The largest number is: " + largestNumber());
		
		sortedArray();
		
		System.out.println("The sorted array is: ");
		display();
		
		System.out.println("The second largest number is: " + secondLargest());
		
		
		scanner.close();
		
		
	}
	


}
