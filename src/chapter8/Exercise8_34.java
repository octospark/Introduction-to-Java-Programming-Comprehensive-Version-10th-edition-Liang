package chapter8;

import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Jan 5, 2018 1:19:59 PM
 * (Geometry: rightmost lowest point) In computational geometry, often you need
 * to find the rightmost lowest point in a set of points. Write the following method
 * that returns the rightmost lowest point in a set of points.
 * public static double[] getRightmostLowestPoint(double[][] points)
 * Write a test program that prompts the user to enter the coordinates of six points
 * and displays the rightmost lowest point.
 */
public class Exercise8_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter six points: ");
		double[][] points = new double[6][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		double[] pos = getRightmostLowestPoint(points);
		System.out.println("The rightmost lowest point is (" + pos[0]
		 + ", " + pos[1] + ")");
		input.close();
	}
	/* Return the rightmost lowest point */
	public static double[] getRightmostLowestPoint(double[][] points) {
		double maxX = points[0][0];
		double minY = points[0][1];
		int pos = 0;
		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > maxX && points[i][1] < minY) {
				
				maxX = points[i][0];
			    minY = points[i][1];
				pos = i;
			}
		}
		return points[pos];
	}
}
