package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 3, 2018 12:09:51 PM
 * (Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 * whether three points are on the same line.
 * Write the following method to test whether all the points in the array points are
 * on the same line.
 * public static boolean sameLine(double[][] points)
 * Write a program that prompts the user to enter five points and displays whether
 * they are on the same line.
 */
public class Exercise8_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points: ");
		double[][] array = new double[5][2];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		if (sameLine(array))
			System.out.println("The five points are on the same line");
		else
			System.out.println("The five points are not on the same line");
		input.close();
	}
	/** Return false if any of the points are not on the line formed from the 
	 * first two points */
	public static boolean sameLine(double[][] array) {
		for (int i = 2; i < array.length; i++) {
			if (!onTheSameLine(array[0][0], array[0][1], array[1][0], array[1][1],
					array[i][0], array[i][1]))
				return false;
		}
		return true;
	}
	/** Return true if point (x2, y2) is on the same
	* line from (x0, y0) to (x1, y1) */
	public static boolean onTheSameLine(double x0, double y0,
	double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (position == 0)
			return true;
		else
			return false;
	}
}
