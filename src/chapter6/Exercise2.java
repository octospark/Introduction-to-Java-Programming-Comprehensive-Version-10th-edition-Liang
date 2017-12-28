/**
 * Made by Erlin Goce
 * Dec 21, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		int sum = sumDigits(number);
		
		System.out.println("The sum of the digits of the number is " + sum);
		input.close();
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			int digit = (int)(n % 10);
			sum += digit;
			n /= 10;
		}
		return sum;
	}
}
