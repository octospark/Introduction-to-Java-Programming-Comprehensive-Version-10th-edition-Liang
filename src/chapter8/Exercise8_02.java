package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 1, 2018 1:14:10 PM
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers
in the major diagonal in an n * n matrix of double values using the following
header:
public static double sumMajorDiagonal(double[][] m)
Write a test program that reads a 4-by-4 matrix and displays the sum of all its
elements on the major diagonal.
 */
public class Exercise8_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		double[][] m = new double[4][4];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();
		System.out.println("The  sum of the elements in the major diagonal is " +
				sumMajorDiagonal(m));
		input.close();
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			sum += m[i][i];
		return sum;
	}
}
