package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 5, 2018 11:57:47 AM
 * (Geometry: area of a triangle) Write a method that returns the area of a triangle
 * using the following header:
 * public static double getTriangleArea(double[][] points)
 * The points are stored in a 3-by-2 two-dimensional array points with points[0]
 * [0] and points[0][1] for (x1, y1). The triangle area can be computed using the
 * formula in Programming Exercise 2.19. The method returns 0 if the three points
 * are on the same line. Write a program that prompts the user to enter three points of
 * a triangle and displays the triangle's area.
 */
public class Exercise8_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter six points: ");
		double[][] points = new double[3][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		double area = getTriangleArea(points);
		if (area == 0)
			System.out.println("The points are on the same line");
		else
			System.out.println("The area of the triangle encosed by the points above is " + area);
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
	/* Distance between two points */
	public static double distance(double x0, double y0, double x1, double y1) {
		double distance = Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
		return distance;
	}
}
