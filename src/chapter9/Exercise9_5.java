package chapter9;
import java.util.GregorianCalendar;
/**
 * @author Erlin Goce
 *
 * Jan 20, 2018 5:08:34 PM
 */
public class Exercise9_5 {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println("Current year " + date.get(GregorianCalendar.YEAR) +
				"\nCurrent month " + date.get(GregorianCalendar.MONTH) +
				"\nCurrent day of month " + date.get(GregorianCalendar.DAY_OF_MONTH));
		date.setTimeInMillis(1234567898765L);
		System.out.println("Year " + date.get(GregorianCalendar.YEAR) +
				"\nMonth " + date.get(GregorianCalendar.MONTH) +
				"\nDay of month " + date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
