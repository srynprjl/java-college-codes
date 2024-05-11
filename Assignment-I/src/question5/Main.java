package question5;
// Write a program in Java to print Fibonacci series up to given number.
public class Main {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n1);
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
}
