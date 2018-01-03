package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 2, 2018 5:26:19 PM
 * (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
 * face up and some face down. You can represent the state of the coins using a
 * 3-by-3 matrix with values 0 (heads) and 1 (tails). Each state can also be represented
 * using a binary number.
 * There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
 * . . . , and 511 to represent all states of the matrix. Write a program that prompts
 * the user to enter a number between 0 and 511 and displays the corresponding
 * matrix with the characters H and T
 */
public class Exercise8_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		
		String str = Integer.toBinaryString(number);
		str = formatString(str);
		
		char[][] chars = toCharArray(str);
		printArray(chars);
		input.close();
	}
	
	public static String formatString(String str) {
		if (str.length() < 9) {
			int difference = 9 - str.length();
			for (int i = 0; i < difference; i++)
				str = "0" + str;
			return str;
		}
		else
			return str;
	}
	
	public static char[][] toCharArray(String str){
		char[][] chars = new char[3][3];
		for (int i = 0; i < str.length(); i++) {
			int rowIndex = i / 3;
			int colIndex = i % 3;
			chars[rowIndex][colIndex] = (str.charAt(i) == '0' ? 'H':'T');
		}
		return chars;		
	}
	
	public static void printArray(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
