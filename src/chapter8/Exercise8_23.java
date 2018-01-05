package chapter8;

import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 11:41:05 AM
 * (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
 * 0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
 * one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
 * cell was flipped. Your program should prompt the user to enter a 6-by-6 array
 * with 0s and 1s and find the first row r and first column c where the even number
 * of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
 * is at (r, c).
 */
public class Exercise8_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int size = input.nextInt();
		System.out.println("Enter binary matrix: ");
		int[][] array = new int[size][size];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = input.nextInt();
		System.out.println("The flipped cell is at (" +findFlippedCell(array)[0] +
				", " + findFlippedCell(array)[1] + ")");
		input.close();
	}
	/* Find the row and column where the number of ones is odd*/
	public static int[] findFlippedCell(int[][] m) {
		int row = 0;
		int col = 0;
		for (int i = 0; i < m.length; i++) {
			int countOnesByRow = 0;
			int countOnesByColumn = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					countOnesByRow++;
				if (m[j][i] == 1)
					countOnesByColumn++;
			}
			if (countOnesByRow % 2 != 0)
				row = i;
			if (countOnesByColumn % 2 != 0)
				col = i;
				
		}
		return new int[] {row, col};
	}
}
