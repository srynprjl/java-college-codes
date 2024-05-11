package question1;
import java.util.Scanner;

// Write a program to print and count all negative numbers in an array.

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n=0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            arr[i] = scanner.nextInt();
        }


        System.out.print("Negative Numbers: ");
        for(int i = 0; i < 10; i++){
            if(arr[i] < 0){
                n++;
                System.out.print(arr[i] + " ");
            }
        }


        System.out.println("\nNegative Number: " + n);
    }
}
