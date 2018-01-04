package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 3, 2018 11:02:39 AM
 * (Explore matrix) Write a program that prompts the user to enter the length of a
 * square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 * finds the rows, columns, and diagonals with all 0s or 1s.
 */
public class Exercise8_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the size of the matrix: ");
		int size = input.nextInt();
		int[][] matrix = randomBinarySquareMatrix(size);
		printArray(matrix);
		printInsights(matrix);
		input.close();
	}
	/** Return a square binary matrix */
	public static int[][] randomBinarySquareMatrix(int size){
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int random = (int)(Math.random() * 2);
				matrix[i][j] = random;
			}
		}
		return matrix;
	}
	/** Print the data  about the matrix */
	public static void printInsights(int[][] array) {
		int countSameRow = 0;
		int countSameCol = 0;
		int countSameMainDiag = 0;
		int countSameSubDiag = 0;
		
		// Check first for cases when there are rows, columns or diagonals
		// having all the same number
		for (int i = 0; i < array.length; i++) {
			
			if (allSameRow(array, i, 1)) {
				countSameRow++;
				System.out.println("All ones on row " + i);
			}
			if (allSameRow(array, i, 0)) {
				countSameRow++;
				System.out.println("All zeros on row " + i);
			}
			if (allSameCol(array, i, 1)) {
				countSameCol++;
				System.out.println("All ones on column " + i);
			}
			if (allSameCol(array, i, 0)) {
				countSameCol++;
				System.out.println("All zeros on column " + i);
			}
		}
		if (allSameMainDiag(array, 0)) {
			countSameMainDiag++;
			System.out.println("All zeros on the main diagonal");
		}
		if (allSameMainDiag(array, 1)) {
			countSameMainDiag++;
			System.out.println("All ones on the main diagonal");
		}
		if (allSameSubDiag(array, 0)) {
			countSameSubDiag++;
			System.out.println("All zeros on the sub diagonal");
		}
		if (allSameSubDiag(array, 1)) {
			countSameSubDiag++;
			System.out.println("All ones on the sub diagonal");
		}
		// Now check if any of the categories of rows, columns or diagonals 
		// have mixed numbers
		if (countSameRow == 0)
			System.out.println("No same numbers on a row");
		if (countSameCol == 0)
			System.out.println("No same numbers on a column");
		if (countSameMainDiag == 0)
			System.out.println("No same numbers on the main diagonal");
		if (countSameSubDiag == 0)
			System.out.println("No same numbers on the sub diagonal");
	}
	/** Return true if all the elements in a given row are equal to number */
	public static boolean allSameRow(int[][] m, int row, int number) {
		int countSame = 0;
		for (int i = 0; i < m[row].length; i++)
			if (m[row][i] == number)
				countSame++;
		if (countSame == m[row].length)
			return true;
		return false;
	}
	/** Return true if all the elements in a given column are equal to number */
	public static boolean allSameCol(int[][] m, int col, int number) {
		int countSame = 0;
		for (int i = 0; i < m.length; i++)
			if (m[i][col] == number)
				countSame++;
		if (countSame == m.length)
			return true;
		return false;
	}
	/** Return true of all elements in the main diagonal are equal to number */
	public static boolean allSameMainDiag(int[][] m, int number) {
		int countSame = 0;
		for (int i = 0; i < m.length; i++)
			if (m[i][i] == number)
				countSame++;
		if (countSame == m.length)
			return true;
		return false;
	}
	/** Return true of all elements in the sub diagonal are equal to number */
	public static boolean allSameSubDiag(int[][] m, int number) {
		int countSame = 0;
		for (int i = 0; i < m.length; i++)
			if (m[m.length - 1 - i][i] == number)
				countSame++;
		if (countSame == m.length)
			return true;
		return false;
	}
	/** Print the array */
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
