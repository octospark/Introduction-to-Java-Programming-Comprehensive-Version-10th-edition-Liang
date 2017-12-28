package chapter4;
import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		//The old keypad phone. This program displays the number for the letter
		// entered from the user in an old keypad phone.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().toLowerCase().charAt(0); //get the lower case letter
		int number = 0; // the number on the keypad
		
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
		
		if (number != 0) {
			System.out.println("The corresponding number is " + number);
		}
		else {
			System.out.println(letter + " is an invalid input");
		}
		input.close();
	}
}
