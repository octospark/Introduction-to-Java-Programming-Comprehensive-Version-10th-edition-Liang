package chapter12;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Feb 18, 2018 4:09:40 PM
 */
public class Quotient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		input.close();
	}
}
