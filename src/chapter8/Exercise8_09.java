package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 2, 2018 4:09:42 PM
 */
public class Exercise8_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] chars = new char[3][3];
		int countPieces = 0;// the total pieces on the table
		boolean winnerFound = false;
		printTable(chars);
		
		while(countPieces < 9) {
			// Player X
			System.out.print("Enter a row (0, 1, or 2) for player X: ");
			int rowX = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player X: ");
			int colX = input.nextInt();
			while(!isEmpty(chars, rowX, colX)) {
				System.out.println("Cell taken. Try another one");
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
				rowX = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				colX = input.nextInt();
			}
			countPieces++;
			chars[rowX][colX] = 'X'; 
			winnerFound = hasWon(chars, 'X');
			printTable(chars);
			if (winnerFound) {
				System.out.println("Player X has won");
				break;
			}
			// this check is done due to the fact that each loop increases this variable
			// by two and it can reach 9 before the loop is ended
			if (countPieces == 9)
				break;
			
			
			// Player O
			System.out.print("Enter a row (0, 1, or 2) for player O: ");
			int rowO = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player O: ");
			int colO = input.nextInt();
			while(!isEmpty(chars, rowO, colO)) {
				System.out.println("Cell taken. Try another one");
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
				rowO = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
				colO = input.nextInt();
			}
			countPieces++;
			chars[rowO][colO] = 'O';
			winnerFound = hasWon(chars, 'O');
			printTable(chars);
			if (winnerFound) {
				System.out.println("Player O has won");
				break;
			}
		}
		if (countPieces == 9)
			System.out.println("This game is a draw");
		input.close();
	}
	/** Check rows, columns and diagonals if there are three of each character */
	public static boolean hasWon(char[][] chars, char ch) {
		// Check rows
		for (int i = 0; i < chars.length; i++) {
			int commonChars = 0;
			for (int j = 0; j < chars[i].length; j++)
				if (chars[i][j] == ch)
					commonChars++;
			if (commonChars == 3)
				return true;
		}
		// Check columns
		for (int i = 0; i < chars.length; i++) {
			int commonChars = 0;
			for (int j = 0; j < chars[i].length; j++)
				if (chars[j][i] == ch)
					commonChars++;
			if (commonChars == 3)
				return true;
		}
		// Check diagonals
		for (int i = 0; i < chars.length; i++) {
			int commonChars = 0;
			if (chars[i][i] == ch)
				commonChars++;
			
			if (commonChars == 3)
				return true;
		}
		
		for (int i = 0; i < chars.length; i++) {
			int commonChars = 0;
			if (chars[i][chars.length - 1 - i] == ch)
				commonChars++;
			
			if (commonChars == 3)
				return true;
		}
		return false;
	}
	/** Check the current cell in the table. If it is empty we can put the current
	 * character, if not return false meaning that it is taken */
	public static boolean isEmpty(char[][] chars, int i, int j) {
		if (chars[i][j] == '\u0000')
			return true;
		return false;
	}
	/** Print the tic-tac-toe table given the array of characters present or not
	 * in the table*/
	public static void printTable(char[][] chars) {
		System.out.println("-------------");
		for (int i = 0; i < chars.length; i++) {
			System.out.println("| " + chars[i][0] + " | " +
					chars[i][1] + " | " + chars[i][2] + " |" );
			System.out.println("-------------");
		}
	}
}
