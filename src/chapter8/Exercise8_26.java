package chapter8;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 2:56:50 PM
 * (Row sorting) Implement the following method to sort the rows in a two-dimensional
 * array. A new array is returned and the original array is intact.
 *       public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new row-sorted matrix.
 */
public class Exercise8_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matryx row by row: ");
		double[][] matrix = new double[3][3];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		System.out.println("the original matrix is ");
		printArray(matrix);
		System.out.println("the sorted by rows matrix is");
		printArray(sortRows(matrix));
		input.close();
	}
	public static double[][] sortRows(double[][] m){
		double[][] matrix = new double[m.length][m[0].length];
		System.arraycopy(m, 0, matrix, 0, m.length);;
		for (int i = 0; i < m.length; i++)
			Arrays.sort(m[i]);
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
