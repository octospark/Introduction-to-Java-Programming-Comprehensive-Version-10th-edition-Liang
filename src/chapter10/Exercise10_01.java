package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 28, 2018 1:30:26 PM
 */
public class Exercise10_01 {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println("Current time is " + t1.getHour() + ":" + t1.getMinute() +
				":" + t1.getSecond());
		System.out.println("The time is " + t2.getHour() + ":" + t2.getMinute() + 
				":" + t2.getSecond());
	}
}
class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		long millis = System.currentTimeMillis();
		int seconds = (int)(millis / 1000);
		this.second = seconds % 60;
		int minutes = seconds / 60;
		this.minute = minutes % 60;
		int hours = minutes / 60;
		this.hour = hours % 24;
		}
	public Time(long elapsedTime) {
		int seconds = (int)(elapsedTime / 1000);
		this.second = seconds % 60;
		int minutes = seconds / 60;
		this.minute = minutes % 60;
		int hours = minutes / 60;
		this.hour = hours % 24;
	}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setTime(long elapsedTime) {
		int seconds = (int)(elapsedTime / 1000);
		this.second = seconds % 60;
		int minutes = seconds / 60;
		this.minute = minutes % 60;
		int hours = minutes / 60;
		this.hour = hours % 24;
	}
}
