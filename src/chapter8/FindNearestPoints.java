package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Dec 31, 2017 1:23:21 PM
 */
public class FindNearestPoints {
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
		int p1 = 0;
		int p2 = 1;
		double shortestDistance = distance(points[p1][0], points[0][1],
				points[p2][0], points[p2][1]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				if (distance < shortestDistance) {
					shortestDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
		}
		System.out.println("The closest two points are (" + points[p1][0] + ", " + 
		points[p1][1] + " ) and (" + points[p2][0] + ", " + points[p2][1] + ")");
		input.close();
	}
	public static double distance(double x0, double y0, double x1, double y1) {
		return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}
}
