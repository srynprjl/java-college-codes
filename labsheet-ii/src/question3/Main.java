package question3;

import java.util.Scanner;

/*
 * The marks obtained by student in 7 different subjects are entered through the
keyboard. The students get a division as per the following rules:
1. Percentage greater or equal to 60 \u2192 First Division
2. Percentage between 45 to 59 \u2192 Second Division
3. Percentage between 35 to 44 \u2192 Third Division
4. Percentage less than 35 \u2192 Fail
5. Marks less than 35 in any subject \u2192 Fail
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] marks = new int[7];
		int percent = 0;
		
		for(int i =0;i<marks.length;i++) {
			System.out.print("Enter the marks: ");
			marks[i]= scanner.nextInt();
		}
		boolean fail = false;
		for(int i =0;i<marks.length;i++) {
			percent += marks[i];
			if(marks[i] < 35) {
				fail = true;
			}
		}
		percent /= 7;
		
		System.out.println("Your percentage is " + percent);
		
		if(percent < 35 || fail) {
			System.out.println("Fail");
		}else  if(percent >= 60) {
			System.out.println("First Division");
		} else if((percent >= 45 && percent < 60)) {
			System.out.println("Second Division");
		} else if(percent >= 35 && percent < 45) {
			System.out.println("Third Division");
		} else {
			System.out.println("Invalid Input");
		}
		
		scanner.close();

	}

}
