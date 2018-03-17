package chapter13;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * @author Erlin Goce
 *
 * Mar 17, 2018 7:15:50 PM
 * 
 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
 * a calendar for a specified month using the Calendar and GregorianCalendar
 * classes. Your program receives the month and year from the command line. For
 * example:
 * 		java Exercise13_04 5 2016
 * This displays the calendar shown in Figure
 */
public class Exercise13_04 {
	public static void main(String[] args) {
		if (args.length == 2) {
			Calendar calendar = new GregorianCalendar(Integer.parseInt(args[1]),
					Integer.parseInt(args[0]), 1);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH);
			printMonth(year, month);
		}
		
		if (args.length == 1) {
			Calendar calendar = new GregorianCalendar();
			calendar.set(Calendar.MONTH, Integer.parseInt(args[0]));
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH);
			printMonth(year, month);
		}
		
		if (args.length == 0) {
			Calendar calendar = new GregorianCalendar();
			
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			printMonth(year, month);
		}
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
		
		// Pad space before the first day of the month
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
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		
		// Return the start day form month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	/** Get total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		
		// get total number of days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i))
				total += 366;
			else
				total += 365;
		}
		
		for (int i = 1; i < month; i++)
			total += getNumberOfDaysInMonth(year, i);
		return total;
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
