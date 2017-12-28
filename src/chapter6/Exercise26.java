/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import chapter6.PrimeNumberMethod;
/**
 * @author pc
 *
 */
public class Exercise26 {
	public static void main(String[] args) {
		final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
		int count = 0;
		int number = 2;
		while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
			if (PrimeNumberMethod.isPrime(number) && isPalindrome(number)) {
				System.out.printf("%7d", number);
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
			number++;
		}
	}
	public static boolean isPalindrome(int n) {
		String number = "" + n;
		int low = 0;
		int high = number.length() - 1;
		boolean isPalindrome = true;
		while (low < high) {
			if (number.charAt(low) != number.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
				
		}
		return isPalindrome;
	}
}
