/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of milliseconds: ");
		long milliseconds = input.nextLong();
		System.out.println(convertMillis(milliseconds));
		input.close();
	}
	public static String convertMillis(long milliseconds) {
		String time = "";
		// Obtain the total seconds
		long totalSeconds = milliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		time = totalHours + ":" + currentMinute + ":" + currentSecond;
		return time;
	}
}
