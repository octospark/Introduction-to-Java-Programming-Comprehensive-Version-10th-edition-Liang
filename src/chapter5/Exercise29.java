package chapter5;
import java.util.Scanner;
/* Display the calendar
 * Given the year and the number start for the January 1
 * print all the months of that year in a calendar
 * */
public class Exercise29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter number for first day of first month: " );
		int firstDay = input.nextInt();
		int daysInMonth = 0;
		for (int month = 1; month <= 12; month++) {
			switch(month) {
			case 1:
				System.out.println("      January " + year);
				daysInMonth = 31;
				break;
			case 2:
				System.out.println("      February " + year);
				daysInMonth = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29:28;
				break;
			case 3:
				System.out.println("      March " + year);
				daysInMonth = 31;
				break;
			case 4:
				System.out.println("      April " + year);
				daysInMonth = 30;
				break;
			case 5:
				System.out.println("      May " + year);
				daysInMonth = 31;
				break;
			case 6:
				System.out.println("      June " + year);
				daysInMonth = 30;
				break;
			case 7:
				System.out.println("      July " + year);
				daysInMonth = 31;
				break;
			case 8:
				System.out.println("      August " + year);
				daysInMonth = 31;
				break;
			case 9:
				System.out.println("      September " + year);
				daysInMonth = 30;
				break;
			case 10:
				System.out.println("      October " + year);
				daysInMonth = 31;
				break;
			case 11:
				System.out.println("      November " + year);
				daysInMonth = 30;
				break;
			case 12:
				System.out.println("      December " + year);
				daysInMonth = 31;
				break;
			}
			System.out.println("---------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			for (int i = 0; i < firstDay; i++) {
				System.out.print("    ");
			}
			for (int k = 1; k <= daysInMonth; k++) {
				
				if(k < 10) {
					System.out.print("   " + k);
				}
				else {
					System.out.print("  " + k);
				}
				if ((k + firstDay) % 7 == 0)
					System.out.println();
			}
			System.out.println("\n");
			firstDay = (firstDay + daysInMonth) % 7;
		}
		input.close();
	}
}
