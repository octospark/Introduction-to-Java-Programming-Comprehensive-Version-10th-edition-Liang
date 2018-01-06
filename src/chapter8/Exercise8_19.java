package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 10:17:09 AM
 * (Pattern recognition: four consecutive equal numbers) Write the following
 * method that tests whether a two-dimensional array has four consecutive numbers
 * of the same value, either horizontally, vertically, or diagonally.
 * Write a test program that prompts the user to enter the number of rows and columns
 * of a two-dimensional array and then the values in the array and displays
 * true if the array contains four consecutive numbers with the same value. Otherwise,
 * display false.
 */
public class Exercise8_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dimensions of the array: ");
		int size = input.nextInt();
		int[][] values = new int[size][size];
		values = randomBinarySquareMatrix(size);
		/*
		System.out.println("Enter values for the (" + rows + "x" + columns + ") matrix: ");
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				values[i][j] = input.nextInt();
		*/
		System.out.println(isConsecutiveFour(values));	
		printMatrix(values);
		input.close();
	}
	/* Check if there are at least for consecutive numbers equal by rows
	 * columns or diagonals */
	public static boolean isConsecutiveFour(int[][] values) {
		//1. Check for the rows and columns
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length - 3; j++) {
				int tempR = values[i][j];
				int countR = 1;
				
				// move by the columns
				for (int k = j + 1; k < j + 4; k++) {
					if (tempR == values[i][k]) {
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
				int tempC = values[j][i];
				int countC = 1;
				// move by the rows
				for (int k = j + 1; k < j + 4; k++) {
					if (tempC == values[k][i]) {
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
				int temp = values[i][j];
				int rowIndex = i + 1;
				for (int k = j + 1; k < j + 4; k++) {
					if (temp == values[rowIndex][k])
						count++;
					rowIndex++;
				}
				if (count == 4) {
					System.out.println(temp + "mD");
					return true;
				}
			}
		}
		//2.b from left-down to right-up
		for (int i = 3; i < values.length; i++) {
			for (int j = 0; j < values[i].length - 3; j++) {
				int count = 1;
				int temp = values[i][j];
				int rowIndex = i - 1;
				for (int k = j + 1; k < j + 4; k++) {
					if (temp == values[rowIndex][k])
						count++;
					rowIndex--;
				}
				if (count == 4) {
					System.out.println(temp + "sD");
					return true;
				}
			}
		}
		return false;
	}
	/** Return a square binary matrix */
	public static int[][] randomBinarySquareMatrix(int size){
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int random = (int)(Math.random() * 3);
				matrix[i][j] = random;
			}
		}
		return matrix;
	}
	/** Print the matrix */
	public static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
