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
public class Exercise21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		String str = input.nextLine();
		
		String number = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				number += getNumber(str.charAt(i));
			}
			else
				number += str.charAt(i);
		}
		System.out.println(number);
		input.close();
	}
	public static int getNumber(char upperCaseLetter) {
		int number = 0;
		char letter = Character.toLowerCase(upperCaseLetter);
		if (letter == 'a' || letter == 'b' || letter == 'c') {
			number = 2;
		}
		else if (letter == 'd' || letter == 'e' || letter == 'f') {
			number = 3;
		}
		else if (letter == 'g' || letter == 'h' || letter == 'i') {
			number = 4;
		}
		else if (letter == 'j' || letter == 'k' || letter == 'l') {
			number = 5;
		}
		else if (letter == 'm' || letter == 'n' || letter == 'o') {
			number = 6;
		}
		else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
			number = 7;
		}
		else if (letter == 't' || letter == 'u' || letter == 'v') {
			number = 8;
		}
		else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
			number = 9;
		}
		return number;
	}
}
