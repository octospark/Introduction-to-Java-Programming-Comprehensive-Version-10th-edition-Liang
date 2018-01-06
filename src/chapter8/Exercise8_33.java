package chapter8;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Jan 5, 2018 12:29:42 PM
 * (Geometry: polygon subareas) A convex 4-vertex polygon is divided into four
 * triangles, as shown in Figure 8.9.
 * Write a program that prompts the user to enter the coordinates of four vertices and
 * displays the areas of the four triangles in increasing order
 */
public class Exercise8_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter four points x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		double[][] pointsForIntersection = points.clone();
		// Swap the second point with the third so that the line from the first
		// point to the third is intersected with the line from the second point
		// to the fourth point
		double[] temp = pointsForIntersection[1];
		pointsForIntersection[1] = pointsForIntersection[2];
		pointsForIntersection[2] = temp;
		double[] intersection = getIntersectingPoint(pointsForIntersection);
		double[] areas = new double[4];
		double[][] threePoints = new double[3][2];
		for (int i = 0; i < points.length - 1; i++) {
			threePoints[0] = points[i];
			threePoints[1] = points[i + 1];
			threePoints[2] = intersection;
			areas[i] = getTriangleArea(threePoints);
		}
		threePoints[0] = points[3];
		threePoints[1] = points[0];
		areas[3] = getTriangleArea(threePoints);
		Arrays.sort(areas);
		System.out.println("The areas are:");
		printList(areas);
		input.close();
	}
	
	/* Return the area of the triangle given the points */
	public static double getTriangleArea(double[][] points) {
		double side1 = distance(points[0][0], points[0][1], points[1][0], points[1][1]);
		double side2 = distance(points[0][0], points[0][1], points[2][0], points[2][1]);
		double side3 = distance(points[1][0], points[1][1], points[2][0], points[2][1]);
		double s = (side1 + side2 + side3) / 2;
		double areaSquared = s * (s - side1) * (s - side2) * (s - side3);
		if (areaSquared < 0.00000000001)
			return 0;
		double area = Math.sqrt(areaSquared);
		return area;
	}
	
	/* Return the intersecting point of the line from the points (x1, y1) and (x2, y2)
	 * and the line from the points (x3, y3) (x4, y4) */
	public static double[] getIntersectingPoint(double[][] points) {
		double a = (points[0][1] - points[1][1]);
		double b = (points[1][0] - points[0][0]);
		double c = (points[2][1] - points[3][1]);
		double d = (points[3][0] - points[2][0]);
		double e = a * points[0][0] + b * points[0][1];
		double f = c * points[2][0] + d * points[2][1];
		double determinant = a * d - b * c;
		if (determinant == 0)
			return null;
		else {
			double[] solution = new double[2];
			solution[0] = (e * d - b * f) / determinant;
			solution[1] = (a * f - e * c) / determinant;
			return solution;
		}
	}
	
	/* Distance between two points */
	public static double distance(double x0, double y0, double x1, double y1) {
		double distance = Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
		return distance;
	}
	public static void printList(double[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
	}
}
