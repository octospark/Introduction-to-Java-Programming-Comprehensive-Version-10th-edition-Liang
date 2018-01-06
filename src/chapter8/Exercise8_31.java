package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 5, 2018 11:40:22 AM
 * (Geometry: intersecting point) Write a method that returns the intersecting point of
 * two lines. The intersecting point of the two lines can be found by using the formula
 * shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 * two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
 * public static double[] getIntersectingPoint(double[][] points)
 * The points are stored in a 4-by-2 two-dimensional array points with
 * (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
 * point or null if the two lines are parallel. Write a program that prompts
 * the user to enter four points and displays the intersecting point.
 */
public class Exercise8_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter four points x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		if (getIntersectingPoint(points) == null)
			System.out.println("The two lines are parallel");
		else {
			double[] intersection = getIntersectingPoint(points);
			System.out.println("The intersection point is (" + intersection[0] + ", " +
			intersection[1] + ")");
		}
		input.close();
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
}
