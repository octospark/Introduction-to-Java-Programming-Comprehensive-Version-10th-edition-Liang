package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 2, 2018 7:13:48 PM
 * (Locate the largest element) Write the following method that returns the location
 * of the largest element in a two-dimensional array.
 * public static int[] locateLargest(double[][] a)
 * The return value is a one-dimensional array that contains two elements. These
 * two elements indicate the row and column indices of the largest element in the
 * two-dimensional array. Write a test program that prompts the user to enter a
 *  two-dimensional
 * array and displays the location of the largest element in the array.
 */
public class Exercise8_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] array = new double[rows][columns];
		System.out.println("Enter the array: ");
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = input.nextDouble();
		int row = locateLargest(array)[0], col = locateLargest(array)[1];
		System.out.println("The location of the largest element is at (" +
		row + ", " + col + ")");
		input.close();
	}
	public static int[] locateLargest(double[][] a) {
		int[] largest = {0, 0};
		double max = a[0][0];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					largest[0] = i;
					largest[1] = j;
				}
			}
		return largest;
	}
}
