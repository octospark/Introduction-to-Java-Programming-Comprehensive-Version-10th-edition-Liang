package chapter12;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Feb 18, 2018 4:16:28 PM
 */
public class QuotientWithMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integer
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int result = quotient(number1, number2);
		
		System.out.println(number1 + " / " + number2 + " is " + result);
		input.close();
	}
	public static int quotient(int number1, int number2) {
		if (number2 == 0) {
			System.out.println("Divisor cannot be zero");
			System.exit(1);
		}
		
		return number1 / number2;
	}
}
