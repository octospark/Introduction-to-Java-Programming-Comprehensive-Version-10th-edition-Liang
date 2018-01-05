package chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 3:06:03 PM
 * (Column sorting) Implement the following method to sort the columns in a two-dimensional
 * array. A new array is returned and the original array is intact.
 * public static double[][] sortColumns(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new column-sorted matrix.
 */
public class Exercise8_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double[][] matrix = new double[3][3];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		System.out.println("the original matrix is ");
		printArray(matrix);
		System.out.println("the sorted by columns matrix is");
		printArray(sortColumns(matrix));
		input.close();
	}
	public static double[][] sortColumns(double[][] m){
		double[][] matrix = new double[m.length][m[0].length];
		System.arraycopy(m, 0, matrix, 0, m.length);;
		for (int i = 0; i < m.length; i++) {
			double[] temp = new double[m[i].length];
			for (int j = 0; j < m[i].length; j++) {
				temp[j] = matrix[j][i];
			}
			Arrays.sort(temp);
			for (int j = 0; j < m[i].length; j++) {
				matrix[j][i] = temp[j];
			}
		}
		return matrix;
	}
	
	/** Print the array */
	public static void printArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%6.3f",arr[i][j]);
			}
			System.out.println();
		}
	}
}
