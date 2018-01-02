package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 2, 2018 3:53:22 PM
 */
public class Exercise8_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < numberOfPoints; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		
		
		double shortestDistance = distance(points[0][0], points[0][1],
				points[1][0], points[1][1]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				if (distance < shortestDistance) {
					shortestDistance = distance;
				}
			}
		}
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				if (distance == shortestDistance) {
					System.out.println("The closest two points are (" +
				points[i][0] + ", " + points[i][1] +
				" ) and (" + points[j][0] + ", " + points[j][1] + ")");
				}
			}
		}
		System.out.println("Their distance is " + shortestDistance);
		input.close();
	}
	public static double distance(double x0, double y0, double x1,
			double y1) {
		return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}
}
