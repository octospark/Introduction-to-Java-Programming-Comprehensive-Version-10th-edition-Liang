package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 1:45:13 PM
 * (Markov matrix) An n * n matrix is called a positive Markov matrix if each
 * element is positive and the sum of the elements in each column is 1. Write the
 * following method to check whether a matrix is a Markov matrix.
 *   public static boolean isMarkovMatrix(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and tests whether it is a Markov matrix.
 */
public class Exercise8_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matryx row by row: ");
		double[][] matrix = new double[3][3];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		
		if (isMarkovMatrix(matrix))
			System.out.println("This is a Markov matrix");
		else
			System.out.println("This is not a Markov matrix");
		input.close();
	}
	/*Check if the sum of the columns is close to number 1 by a given margin
	 * The exact check for equality would likely fail due to the way floating
	 * point numbers are stored */
	public static boolean isMarkovMatrix(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			double sumC = 0;
			for (int j = 0; j < m[i].length; j++)
				sumC += m[j][i];
			if (!(sumC - 1 < 0.000000001))
				return false;
		}
		return true;
	}
}
