package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 6, 2018 10:57:11 AM
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
 * each occurring exactly once in each row and once in each column. Write a
 * program that prompts the user to enter the number n and the array of characters,
 * as shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 */
public class Exercise8_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number n: ");
		int number  = input.nextInt();
		System.out.println("Enter " + number + " rows of letters separated by spaces: ");
		char[][] chars = new char[number][number];
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				String str = input.next();
				char ch = str.charAt(0);
				ch = Character.toUpperCase(ch);
				if (ch < 'A' || ch > (char)('A' + number - 1)) {
					System.out.println("Wrong input. Letters should be between A and " +
				(char)('A' + number - 1));
					System.exit(0);
				}
				chars[i][j] = ch;
			}
		}
		if (isLatinSquare(chars))
			System.out.println("The input array is Latin square");
		else
			System.out.println("The input array is not Latin square");
		input.close();
	}
	public static boolean isLatinSquare(char[][] chars) {
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length - 1; j++) {
				char startRow = chars[i][j];
				char startCol = chars[j][i];
				for (int k = j + 1; k < chars[i].length; k++) {
					if (startRow == chars[i][k])
						return false;
					if (startCol == chars[k][i])
						return false;
				}
			}
		}
		return true;
	}
}
