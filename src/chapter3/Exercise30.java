package chapter3;

import java.util.Scanner;

public class Exercise30 {
	public static void main(String[] args){
		// Create Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the offset to GMT: ");
		long offset = input.nextLong();
		
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
		long currentHour = totalHours % 24 + offset;
		
		if (currentHour > 12) {
			System.out.println("Current time is " + (currentHour % 12) + ":" + 
					currentMinute + ":" + currentSecond + " PM");
		}
		else
			System.out.println("Current time is " + currentHour + ":" + 
					currentMinute + ":" + currentSecond + " AM");
		// Display the results
		
		input.close();
	}
}
