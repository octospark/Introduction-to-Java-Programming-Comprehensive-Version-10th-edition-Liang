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
public class Exercise31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter credit card number as long integer: ");
		long number = input.nextLong();
		if (isValid(number))
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");
		input.close();
	}
	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		/* We will assume the card is valid 
		 * initially and we will test if 
		 * the validity holds after these tests
		 * */
		boolean length = true;
		boolean prefix = true;
		boolean checkSum = true;
		
		// The prefix criteria
		if (!(prefixMatched(number, 4) || prefixMatched(number, 5) ||
				prefixMatched(number, 37) || prefixMatched(number, 6))) {
			prefix = false;
		}
		
		// The length criteria
		if (getSize(number) < 13 || getSize(number) > 16)
			 length = false;
		
		// The checksum criteria
		int oddSum = sumOfOddPlace(number);
		int doubleEvenSum = sumOfDoubleEvenPlace(number);
		int total = oddSum + doubleEvenSum;
		
		if (total % 10 != 0)
			checkSum = false;
		return ((prefix && length) && checkSum);
	}
	
	/** Get the sum of double the even place of the card numbers */
	public static int sumOfDoubleEvenPlace(long number) {
		String s = "" + number;
		int sum = 0;
		for (int i = s.length() - 2; i >= 0 ; i -= 2) {
			int digit = Character.getNumericValue(s.charAt(i));
			sum += getDigit(2 * digit);
		}
		return sum;
	}
	
	/** Return this number if single digit, otherwise, return the sum of the two digits */
	public static int getDigit(int number) {
		String s = "" + number;
		int sum = 0;
		if (s.length() == 2) {
			
			sum += (number % 10);
			sum += number / 10;
		}
		else
			sum = number;
		return sum;
	}
	
	/** Return the sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		String s = "" + number;
		int sum = 0;
		for (int i = s.length() - 1; i >= 0 ; i -= 2) {
			sum += Character.getNumericValue(s.charAt(i));
		}
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		String str = "" + number;
		String prefix = "" + d;
		if (str.startsWith(prefix)) {
			return true;
		}
		else
			return false;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		String number = "" + d;
		return number.length();
	}
	
	/** Return the first k number of digits from number. if the 
	 *  number of digits in number is less than k, return number*/
	public static long getPrefix(long number, int k) {
		String n = "" + number;
		if (k > n.length()) {
			return number;
		}
		else {
			String prefix = n.substring(0, k);
			return Long.parseLong(prefix);
		}
	}
}
