package chapter10;
import java.util.GregorianCalendar;
/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 11:15:14 AM
 */
public class Exercise10_14 {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		System.out.println("Year: " +date.getYear());
		System.out.println("Month: " + date.getMonth());
		System.out.println("Day: " + date.getDay());
	}
}
class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		GregorianCalendar date = new GregorianCalendar();
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public MyDate(long elapsedTime) {
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(long elapsedTime) {
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}
