/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;

import java.util.Scanner;

/**
 * @author pc
 *
 */
public class Exercise34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter full year (e.g., 2012): ");
		int year = input.nextInt();
		
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();
		printMonth(year, month);
		input.close();
	}
	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		
		printMonthBody(year, month);
	}
	
	public static void printMonthTitle(int year, int month) {
		System.out.println("        " + getMonthName(month) + " " + year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static void printMonthBody(int year, int month) {
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(month, year);
		
		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		
		// Pad space before the first day of month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
	}
	
	// Get the English month name
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December"; break;
		}
		return monthName;
	}
	
	/** Get the start day of month/1/year */
	public static int getStartDay(int year, int month) {
		//4. Calculate the day of the week using the Zeller congruence formula
		int century = (int)(year / 100);;//j in the formula
		int centuryYear = year % 100;//k in the formula
		//System.out.println(centuryYear);
		
		int dayOfWeek = ((1 + 26 * (month + 1) / 10 + centuryYear + centuryYear / 4 +
				century / 4 + 5 * century) % 7);
		return dayOfWeek;
	}
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2)
			return (isLeapYear(year)) ? 29:28;
		return 0;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
