/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();
		checkPassword(password);
		input.close();
	}
	public static void checkPassword(String pass) {
		boolean sentinel = true;
		if (pass.length() < 8)
			sentinel = false;
		
		int numOfDigits = 0; // counter for the number of digits
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				sentinel = false;
				break;
			}
			if (Character.isDigit(pass.charAt(i)))
				numOfDigits++;
		}
		if (numOfDigits < 2)
			sentinel = false;
		
		if (sentinel)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
}
