package chapter11;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Feb 16, 2018 6:32:50 PM
 * 
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon.
 * 
 */
public class Exercise11_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		System.out.println("Enter " + numberOfPoints + " (x, y) points: ");
		for (int i = 0; i < numberOfPoints * 2; i++)
			list.add(input.nextDouble());
		// Adding the first point again to close the loop for the polygon
		list.add(list.get(0));
		list.add(list.get(1));
		
		if (!isConvex(list)) {
			System.out.println("The polygon is not convex");
		} else {
			System.out.println("The surface of the polygon is: " + getSurface(list));
		}
		input.close();
	}
	public static boolean isConvex(ArrayList<Double> list) {
		for (int i = 0; i < list.size() - 5; i+= 2) {
			double firstSlope = (list.get(i + 3) - list.get(i + 1)) / (list.get(i + 2) - list.get(i));
			double secondSlope = (list.get(i + 5) - list.get(i + 3)) / (list.get(i + 4) - list.get(i + 2));
			double angle = Math.PI - Math.atan((firstSlope - secondSlope) / (1 + firstSlope * secondSlope));
			if (angle > Math.PI)
				return false;
		}
		return true;
	}
	public static double getSurface(ArrayList<Double> list) {
		double sumOfTriangleSurfaces = 0;
		// Get the initial fixed point and loop for the other points of the polygon
		// two by two
		double x0 = list.get(0);
		double y0 = list.get(1);
		for (int i = 2; i < list.size() - 4; i+=2)
			sumOfTriangleSurfaces += getTriangleSurface(x0, y0, list.get(i),
					list.get(i + 1), list.get(i + 2), list.get(i + 3));
		return sumOfTriangleSurfaces;
	}
	
	public static double getTriangleSurface(double x1, double y1, double x2,
			double y2, double x3, double y3) {
		double side1 = getDistance(x1, y1, x2, y2);
		double side2 = getDistance(x1, y1, x3, y3);
		double side3 = getDistance(x2, y2, x3, y3);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
