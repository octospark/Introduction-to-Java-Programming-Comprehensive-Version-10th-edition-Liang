package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 5, 2018 3:21:28 PM
 * (Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop colored disks into a seven-column, six-row vertically
 * suspended grid, as shown below.
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * ———————————————
 * Drop a red disk at column (0–6)
 * 
 * The objective of the game is to connect four same-colored disks in a row, a column,
 * or a diagonal before your opponent can do likewise. The program prompts
 * two players to drop a red or yellow disk alternately. In the preceding figure, the
 * red disk is shown in a dark color and the yellow in a light color. Whenever a disk
 * is dropped, the program redisplays the board on the console and determines the
 * status of the game (win, draw, or continue).
 */
public class Exercise8_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] chars = new char[6][7];
		printTable(chars);
		char winner = '\u0000';
		int column;
		while (hasEmptyChars(chars)) {
			System.out.print("Drop a red disk at column (0-6): ");
			column = input.nextInt();
			while (!isDiskDropSuccessful(chars, column, 'R')) {
				System.out.println("Inalid position, red. Try another column (0-6): ");
				column = input.nextInt();
			}
			printTable(chars);
			if (isConsecutiveFour(chars, 'R')) {
				winner = 'R';
				break;
			}
			System.out.print("Drop a yellow disk at column (0-6): ");
			column = input.nextInt();
			while (!isDiskDropSuccessful(chars, column, 'Y')) {
				System.out.println("Inalid position, yellow. Try another column (0-6): ");
				column = input.nextInt();
			}
			printTable(chars);
			if (isConsecutiveFour(chars, 'Y')) {
				winner = 'Y';
				break;
			}
		}
		
		if (winner == '\u0000')
			System.out.println("This game is a draw");
		else if (winner == 'R')
			System.out.println("The red player won");
		else
			System.out.println("The yellow player won");
		input.close();
	}
	/** Drop a disk (character) and return true if the operation was successful*/
	public static boolean isDiskDropSuccessful(char[][] chars, int column, char ch){
		int i = chars.length - 1;
		while (i >= 0) {
			if (chars[i][column] == '\u0000') {
				chars[i][column] = ch;
				break;
			}
			i--;
		}
		if (i < 0)
			return false;
		return true;
	}
	/** Print the table of the game Connect Four */
	public static void printTable(char[][] chars) {
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				System.out.print("|" + chars[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("---------------");
		System.out.println("|0|1|2|3|4|5|6|");
	}
	/** Check if there are at least for consecutive characters equal by rows
	 * columns or diagonals */
	public static boolean isConsecutiveFour(char[][] values, char ch) {
		//1. Check for the rows and columns
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length - 3; j++) {
				char tempR = values[i][j];
				int countR = 1;
				
				// move by the columns
				for (int k = j + 1; k < j + 4; k++) {
					if (tempR == values[i][k] && tempR == ch) {
						countR++;
					}
				}
				if (countR == 4) {
					return true;
				}
			}
		}
		for (int i = 0; i < values[0].length; i++) {
			for (int j = 0; j < values.length - 3; j++) {
				char tempC = values[j][i];
				int countC = 1;
				// move by the rows
				for (int k = j + 1; k < j + 4; k++) {
					if (tempC == values[k][i] && tempC == ch) {
						countC++;
						
					}
				}
				if (countC == 4) {
					return true;
				}
			}
		}
		//2. Check diagonals
		//2.a from left-up to right-down
		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 0; j < values[i].length - 3; j++) {
				int count = 1;
				char temp = values[i][j];
				int rowIndex = i + 1;
				for (int k = j + 1; k < j + 4; k++) {
					if (temp == values[rowIndex][k] && temp == ch)
						count++;
					rowIndex++;
				}
				if (count == 4) {
					return true;
				}
			}
		}
		//2.b from left-down to right-up
		for (int i = 3; i < values.length; i++) {
			for (int j = 0; j < values[i].length - 3; j++) {
				int count = 1;
				char temp = values[i][j];
				int rowIndex = i - 1;
				for (int k = j + 1; k < j + 4; k++) {
					if (temp == values[rowIndex][k] && temp == ch)
						count++;
					rowIndex--;
				}
				if (count == 4) {
					return true;
				}
			}
		}
		return false;
	}
	/** Return true if there is at least a position with an empty character */
	public static boolean hasEmptyChars(char[][] chars) {
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				if (chars[i][j] == '\u0000')
					return true;
			}
		}
		return false;
	}
}
