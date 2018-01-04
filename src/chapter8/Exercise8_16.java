package chapter8;

import java.util.Arrays;

/**
 * @author Erlin Goce
 *
 * Jan 3, 2018 12:41:12 PM
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * p.s instructions were unclear and I did what I thought was the most meaningful
 * solution: a two-dimensions array sorted by rows and columns
 */
public class Exercise8_16 {
	public static void main(String[] args) {
		int[][] array = {{4, 2},{1, 7},{3, 5},{2, 2},{1, 1},{4, 1}};
		sortTwoDArray(array);
		printArray(array);
	}
	public static void sortTwoDArray(int[][] arr) {
		// Sorting by rows
		for (int i = 0; i < arr.length; i++)
			Arrays.sort(arr[i]);
		// Sorting by columns
		for (int i = 0; i < arr[0].length; i++) {
			int[] col = new int[arr.length];
			for (int j = 0; j < arr.length; j++) {
				col[j] = arr[j][i];
			}
			Arrays.sort(col);
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = col[j];
			}
		}
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
