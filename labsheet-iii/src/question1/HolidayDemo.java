package question1;

import java.util.Scanner;

public class HolidayDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of holiday: ");
		String name = scanner.nextLine();
		System.out.println("Enter the day of holiday: ");
		int day = scanner.nextInt();
		System.out.println("Enter the month of holiday: ");
		String month = scanner.next();
		System.out.println("Is the holiday given? ");
		boolean holiday = scanner.nextBoolean();
		
		Holiday holidayI = new Holiday();
		holidayI.setDay(day);
		holidayI.setMonth(month);
		holidayI.setName(name);
		holidayI.setHoliday(holiday);
		
		System.out.println("[ Name:" + holidayI.getName() + " Month:" + holidayI.getMonth() + " Day: " + holidayI.getDay() + " Holiday: " + holidayI.isHoliday() + " ]");
					
		scanner.close();
		
	}

}
