package chapter4;
import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String month = input.next();
		
		int days = 0;
		
		switch(month) {
		case "Jan":
			days = 31;
			break;
		case "Feb":
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				days = 29;
			else
				days = 28;
			break;
		case "Mar":
			days = 31;
			break;
		case "Apr":
			days = 30;
			break;
		case "May":
			days = 31;
			break;
		case "Jun":
			days = 30;
			break;
		case "Jul":
			days = 31;
			break;
		case "Aug":
			days = 31;
			break;
		case "Sep":
			days = 30;
			break;
		case "Oct":
			days = 31;
			break;
		case "Nov":
			days = 30;
			break;
		case "Dec":
			days = 31;
			break;
		}
		if (days != 0) {
			System.out.println(month + " " + year + " has " + days + " days");
		}
		else
			System.out.println("Invalid input. Please type the month i.e., Jan for January");
		
		input.close();
	}
}
