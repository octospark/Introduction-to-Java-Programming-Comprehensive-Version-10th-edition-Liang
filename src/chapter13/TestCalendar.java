package chapter13;
import java.util.*;
/**
 * @author Erlin Goce
 *
 * Mar 12, 2018 10:52:10 PM
 */
public class TestCalendar {
	public static void main(String[] args) {
		// Construct a Gregorian calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		System.out.println("Current time is " + new Date());
		System.out.println("YEAR: " + calendar.get(calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(calendar.MONTH));
		System.out.println("DATE: " + calendar.get(calendar.DATE));
		System.out.println("HOUR_OF_DAY: " + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + calendar.get(calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(calendar.SECOND));
		System.out.println("DAY_OF_YEAR: " + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR: " + calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("YEAR: " + calendar.get(calendar.YEAR));
		
		// Construct a calendar for 28/10/2015
		Calendar calendar1 = new GregorianCalendar(2015, 9, 28);
		String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday",
				"Friday", "Saturday"};
		System.out.println("October 28, 2015 is a " +
				dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
	}
}
