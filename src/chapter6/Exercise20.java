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
public class Exercise20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int count = countLetters(str);
		System.out.println("The string has " + count + " letters");
		input.close();
	}
	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				count++;
		}
		return count;
	}
}
