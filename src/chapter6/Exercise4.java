/**
 * Made by Erlin Goce
 * Dec 21, 2017
 */
package chapter6;
import chapter6.Exercise3;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println("The reverse of " + number + " is " + Exercise3.reverse(number));
		input.close();
	}
}
