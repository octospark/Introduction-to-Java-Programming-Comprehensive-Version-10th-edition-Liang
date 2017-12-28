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
public class Exercise23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.print("Enter a character: ");
		String ch = input.next();
		char cha = ch.charAt(0);
		System.out.println("The character " + cha + " occurs " + count(str, cha) + " times");
		input.close();
	}
	public static int count(String s, char ch) {
		int count = 0;
		s = s.toLowerCase();
		System.out.println(s);
		ch = Character.toLowerCase(ch);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
}
