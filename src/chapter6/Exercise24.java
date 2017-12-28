/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import chapter6.PrintCalendar;
/**
 * @author pc
 *
 */
public class Exercise24 {
	public static void main(String[] args) {
		double days = (System.currentTimeMillis() * 1.0)/ (1000 * 3600 * 24);
		
		year((int)days);
	}
	public static void year(int days) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		/** Compute the year, month and day*/
		int year = 1970;
		while (days > 367) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days -= 366;
				}
			else
				days-= 365;
			year++;
		}
		
		int month = 1;// starting with the first month
		while (days >= 31 && month <= 12) {
			int daysInMonth = PrintCalendar.getNumberOfDaysInMonth(year, month);
			days -= daysInMonth;
			month++;
		}
		String monthName = "";
		int day = days + 1;// we are at a given date even though the time for that date has not passed yet
		switch(month) {
		case 1:monthName = "January"; break;
		case 2:monthName = "February"; break;
		case 3:monthName = "March"; break;
		case 4:monthName = "April"; break;
		case 5:monthName = "May"; break;
		case 6:monthName = "June"; break;
		case 7:monthName = "July"; break;
		case 8:monthName = "August"; break;
		case 9:monthName = "September"; break;
		case 10:monthName = "October"; break;
		case 11:monthName = "November"; break;
		case 12:monthName = "December"; break;
		}
		System.out.println("Current date and time is " + monthName + " " + 
		day + ", " + year + "  " + timeFormat(currentHour, currentMinute, currentSecond));
	}
	public static String timeFormat(long h, long m, long s) {
		String str = "";
		if (h < 10)
			str += "0" + h;
		else
			str += h;
		str += ":";
		if (m < 10)
			str += "0" + m;
		else
			str += m;
		str += ":";
		if (s < 10)
			str += "0" + s;
		else
			str += s;
		return str;
	}
}
