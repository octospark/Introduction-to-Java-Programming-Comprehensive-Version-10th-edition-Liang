package chapter5;
import java.util.Scanner;
public class Exercise28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter first day of year (e.g., 0 for Sunday, 1 for Monday etc): ");
		int firstDay = input.nextInt();
		for (int month = 1; month <= 12; month++) {
			
			//1. A switch to determine the month and the first day of every month
			switch(month) {
			case 1:
				System.out.print("January 1 " + year + " is ");
				break;
			case 2:
				firstDay = (firstDay + 31) % 7;
				System.out.print("February 1 " + year + " is ");
				break;
			case 3:
				int days = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29:28;
				firstDay = (firstDay + days) % 7;
				System.out.print("March 1 " + year + " is ");
				break;
			case 4:
				firstDay = (firstDay + 31) % 7;
				System.out.print("April 1 " + year + " is ");
				break;
			case 5:
				firstDay = (firstDay + 30) % 7;
				System.out.print("May 1 " + year + " is ");
				break;
			case 6:
				firstDay = (firstDay + 31) % 7;
				System.out.print("June 1 " + year + " is ");
				break;
			case 7:
				firstDay = (firstDay + 30) % 7;
				System.out.print("July 1 " + year + " is ");
				break;
			case 8:
				firstDay = (firstDay + 31) % 7;
				System.out.print("August 1 " + year + " is ");
				break;
			case 9:
				firstDay = (firstDay + 31) % 7;
				System.out.print("September 1 " + year + " is ");
				break;
			case 10:
				firstDay = (firstDay + 30) % 7;
				System.out.print("October 1 " + year + " is ");
				break;
			case 11:
				firstDay = (firstDay + 31) % 7;
				System.out.print("November 1 " + year + " is ");
				break;
			case 12:
				firstDay = (firstDay + 30) % 7;
				System.out.print("December 1 " + year + " is ");
				break;
			}
			//2. A switch to determine the	 day of the week
			switch(firstDay) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
		}
		input.close();
	}
}
