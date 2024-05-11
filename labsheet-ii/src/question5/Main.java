package question5;

import java.util.Scanner;
//Write a program to read 10 characters from user and count all the vowel and consonant in array.
public class Main {
	public static void main(String[] args) {
		char[] ch = new char[10];
		int vowel=0, consonant=0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0;i<10;i++) {
			System.out.println("Enter a character: ");
			ch[i] = scanner.next().charAt(0);
		}
		
		
		for(int i =0;i<10;i++) {
			switch(ch[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
			default:
				consonant++;
				break;
			}
		
		}
		System.out.println("Vowel: " + vowel);
		System.out.println("Consonant: " + consonant);
		
		scanner.close();
	}

}
