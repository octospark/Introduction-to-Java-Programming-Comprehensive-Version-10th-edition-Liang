/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise16 {
	public static void main(String[] args) {
		int year = 2000;
		System.out.println("Year       Days");
		System.out.println("---------------");
		while (year <= 2020) {
			System.out.printf("%-7d%7d\n", year, numberOfDaysInAYear(year));
			year++;
		}
		
	}
	public static int numberOfDaysInAYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0)) {
			return 366;
		}
		else
			return 355;
	}
}
