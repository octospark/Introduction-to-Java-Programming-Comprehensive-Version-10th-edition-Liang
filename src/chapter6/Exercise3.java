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
public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		if(isPalindrome(number)) {
			System.out.println("The number is a palindrome");
		}
		else
			System.out.println("The number is not a palindrome");
		
		input.close();
	}
	
	public static int reverse(int number) {
		String g = "";
		while (number != 0) {
			int digit = number % 10;
			number /= 10;
			g = g + digit;
		}
		return Integer.parseInt(g);
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
