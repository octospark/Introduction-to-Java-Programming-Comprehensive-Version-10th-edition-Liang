package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 5, 2018 1:41:56 PM
 * (Largest block) Given a square matrix with the elements 0 or 1, write a program
 * to find a maximum square submatrix whose elements are all 1s. Your program
 * should prompt the user to enter the number of rows in the matrix. The program
 * then displays the location of the first element in the maximum square submatrix
 * and the number of the rows in the submatrix.
 * Your program should implement and use the following method to find the maximum
 * square submatrix:
 * public static int[] findLargestBlock(int[][] m)
 * The return value is an array that consists of three values. The first two values are
 * the row and column indices for the first element in the submatrix, and the third
 * value is the number of the rows in the submatrix.
 */
public class Exercise8_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows in matrix: ");
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		System.out.print("Enter 0 to generate a random matrix or 1 to enter values manually: ");
		int choice = input.nextInt();
		if (choice == 1) {
			for (int i = 0; i < size; i++)
				for (int j = 0; j < size; j++)
					matrix[i][j] = input.nextInt();
			}
		else {
			matrix = randomBinarySquareMatrix(size);
		}
		System.out.println("The matrix is: ");
		printMatrix(matrix);
		System.out.println();
		int[] solution = findLargestBlock(matrix);
		System.out.println("The maximum square submatrix is at (" + solution[0] + ", " + 
		solution[1] + ") with size " + solution[2]);
		input.close();
	}
	/** Start from the largest sub-box of the matrix and search for the 
	 * one that has all the elements one*/
	public static int[] findLargestBlock(int[][] m) {
		int size = m.length;
		int[] position = new int[3];
		boolean found = false;
		while (size >= 2) {
			for (int i= 0; (i <= m.length - size) && !found; i++) {
				for (int j = 0; j <= m[i].length - size; j++) {
					int[][] bl = findBlock(m, i, j, size);
					if (allOnes(bl)) {
						position[0] = i;
						position[1] = j;
						position[2] = size;
						printMatrix(bl);
						found = true;
						break;
					}
				}
			}
			
			if (found)
				break;
			size--;
		}
		return position;
	}
	/** Return true if the block has all ones*/
	public static boolean allOnes(int[][] block) {
		for (int i = 0; i < block.length; i++) {
			for (int j = 0; j < block[i].length; j++) {
				if (block[i][j] == 0)
					return false;
			}
		}
		return true;
	}
	/** Return the block with the given size from the position i, j*/
	public static int[][] findBlock(int[][] array, int i, int j, int size) {
		int[][] block = new int[size][size];
		for (int k = i, n = 0; k < i + size; k++, n++) {
			for (int m = j, p = 0; m < j + size; m++, p++) {
				block[n][p] = array[k][m];
			}
		}
		return block;
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
}
