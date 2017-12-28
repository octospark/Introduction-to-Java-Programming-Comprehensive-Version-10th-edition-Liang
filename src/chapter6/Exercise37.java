/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number and format number: ");
		int number= input.nextInt();
		int formatNumber = input.nextInt();
		
		System.out.println(format(number, formatNumber));
		input.close();
	}
	public static String format(int number, int formatNumber) {
		String numberString = "" + number;
		
		int difference =  formatNumber - numberString.length();
		if (difference <= 0) {
			return numberString;
		}
		else {
			for (int i = 0; i < difference; i++) {
				numberString = '0' + numberString;
			}
			return numberString;
		}
	}
}
