package chapter3;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		// Create a scanner and get the data for today's day and the number
		// of days from today
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day (0 to 6 for Sunday to Saturday respectively): ");
		int today = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		// Calculate the day and display the result
		switch(today) {
		case 0:
			System.out.print("Today is Sunday and ");
			break;
		case 1:
			System.out.print("Today is Monday and ");
			break;
		case 2:
			System.out.print("Today is Tuesday and ");
			break;
		case 3:
			System.out.print("Today is Wednesday and ");
			break;
		case 4:
			System.out.print("Today is Thursday and ");
			break;
		case 5:
			System.out.print("Today is Friday and ");
			break;
		case 6:
			System.out.print("Today is Saturday and ");
		}
		
		
		int dayInTheFuture = ((today + daysElapsed) % 7);
		
		switch(dayInTheFuture) {
		case 0:
			System.out.print("the future day is Sunday");
			break;
		case 1:
			System.out.print("the future day is Monday");
			break;
		case 2:
			System.out.print("the future day is Tuesday");
			break;
		case 3:
			System.out.print("the future day is Wednesday");
			break;
		case 4:
			System.out.print("the future day is Thursday");
			break;
		case 5:
			System.out.print("the future day is Friday");
			break;
		case 6:
			System.out.print("the future day is Saturday");
		}
		input.close();
	}
}
