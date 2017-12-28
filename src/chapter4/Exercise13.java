package chapter4;
import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String str = input.nextLine();
		char character = str.charAt(0);
		
		if (((int)character >= 65 && (int)character <= 90) ||
				((int)character >= 97 && (int)character <= 122)) {
			if (character == 'a' || character == 'A' || character == 'e' || character == 'E' ||
					character == 'i' || character == 'I' || character == 'o' || character == 'O' ||
					character == 'u' || character == 'U')
				System.out.println(character + " is a vowel");
			else
				System.out.println(character + " is a consonant");
		}
		else
			System.out.println(character + " is invalid input");
		
		input.close();
	}
}
