package question11;

import java.util.Scanner;

/*WAP to input radius of circle then find circumference and area.*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		int r = scanner.nextInt();
		double cir = 2* Math.PI * r;
		double area = Math.PI * r* r;
		System.out.println("The circumference of circle is : " + cir );
		System.out.println("The area of circle is : " + area);
		
		scanner.close();

	}

}
