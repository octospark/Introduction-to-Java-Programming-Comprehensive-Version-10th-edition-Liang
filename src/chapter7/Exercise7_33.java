package chapter7;

import java.util.Scanner;

/**
 * @author pc
 *
 * Dec 29, 2017
 */
public class Exercise7_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		String[] chineseZodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit",
				"dragon", "snake", "horse", "sheep"};
		int sign = year % 12;
		System.out.println("The sign for the year " + year + " is " + chineseZodiac[sign]);
		input.close();
	}
}
