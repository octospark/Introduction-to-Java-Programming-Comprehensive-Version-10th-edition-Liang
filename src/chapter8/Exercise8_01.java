package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 1, 2018 1:02:32 PM
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix
 */
public class Exercise8_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		double[][] matrix = new double[3][4];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		
		for (int i = 0; i < matrix[0].length; i++)
			System.out.println("Sum of the elements at column " + i +
					" is " + sumColumn(matrix, i));
		input.close();
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sumColumn = 0;
		for (int i = 0; i < m.length; i++)
			sumColumn += m[i][columnIndex];
		return sumColumn;
	}
}
