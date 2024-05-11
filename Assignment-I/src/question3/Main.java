package question3;

import java.util.Scanner;

// Write a program to check whether two matrices are equal or not.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.println("Matrix 1: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 2: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m2[i][j] = scanner.nextInt();
            }
        }

        boolean flag = true;
        for(int i=0;i<3 && flag;i++){
            for(int j=0;j<3;j++){
                if(m1[i][j] != m2[i][j]){
                    flag = false;
                    break;

                }
            }
        }

        if(flag){
            System.out.println("Matrix 1 and Matrix 2 are equal ");
        } else{
            System.out.println("Matrix 1 and Matrix 2 are not equal ");
        }
    }
}
