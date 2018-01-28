package chapter10;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 27, 2018 6:32:52 PM
 */
public class PalindromeIgnoreNonAlphaNumeric {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("Ignoring nonalphanumeric characters, \nis " + s + 
				" a palindrome? " + isPalindrome(s));
		input.close();
	}
	public static boolean isPalindrome(String s) {
		// Create a new string by eliminating non-alphanumeric chars
		String s1 = filter(s);
		
		// Create a new string that is the reversal of s1
		String s2 = reverse(s1);
		
		// Check if the reversal is the same as the original string
		return s1.equals(s2);
	}
	
	public static String filter(String s) {
		// Create a string builder
		StringBuilder stringBuilder = new StringBuilder();
		
		// Examine each char in the string to skip alphanumeric char
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
