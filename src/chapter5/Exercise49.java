/*
 *(Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
* Write a program that prompts the user to enter a string and displays the number
* of vowels and consonants in the string.
* Made from Erlin Goce on 12/18/2017
 */
package chapter5;
import java.util.Scanner;
public class Exercise49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		str = str.toUpperCase();
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (Character.isLetter(character)) {
				if (character == 'A' || character == 'E' || character == 'I' ||
						character == 'O' || character == 'U')
					vowels++;
				else
					consonants++;
			}
			
		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
		input.close();
	}
}
