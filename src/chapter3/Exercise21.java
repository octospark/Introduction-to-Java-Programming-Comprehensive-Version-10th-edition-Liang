package chapter3;
import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		//1. Create a scanner to obtain from the user the data
		Scanner input = new Scanner(System.in);
		
		//2. Gather the data for the program
		System.out.print("Enter year: (e.g., 2017): ");
		int year = input.nextInt();
		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();// m in the formula
		System.out.print("Enter the day of the month (1-31): ");
		int dayOfMonth = input.nextInt(); // q in the formula
		
		//3. Check if month is 1 or 2 and change them to 13 and 14 respectively
		// Also change the year to the previous one if this is the case
		if (month == 1) {
			year--;
			month = 13;
		}
		if (month == 2) {
			year--;
			month = 14;
		}
		
		//4. Calculate the day of the week using the Zeller congruence formula
		int century = (int)(year / 100);;//j in the formula
		int centuryYear = year % 100;//k in the formula
		System.out.println(centuryYear);
		
		int dayOfWeek = ((dayOfMonth + 26 * (month + 1) / 10 + centuryYear + centuryYear / 4 +
				century / 4 + 5 * century) % 7);
		
		
		//5. determine the day of the week and print it
		switch(dayOfWeek) {
		case 0:
			System.out.println("Day of the week is Saturday");
			break;
		case 1:
			System.out.println("Day of the week is Sunday");
			break;
		case 2:
			System.out.println("Day of the week is Monday");
			break;
		case 3:
			System.out.println("Day of the week is Tuesday");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday");
			break;
		case 5:
			System.out.println("Day of the week is Thursday");
			break;
		case 6:
			System.out.println("Day of hte week is Friday");
			break;
		}
		input.close();
	}
}
