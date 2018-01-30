package chapter10;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 12:01:44 PM
 * 
 * (Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle
 * that encloses a set of points in a two-dimensional plane, as shown in
 * Figure 10.24d. Write a method that returns a bounding rectangle for a set of
 * points in a two-dimensional plane, as follows:
 * public static MyRectangle2D getRectangle(double[][] points)
 * The Rectangle2D class is defined in Programming Exercise 10_13. Write a
 * test program that prompts the user to enter five points and displays the bounding
 * rectangle’s center, width, and height.
 */
public class Exercise10_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points: ");
		double[][] points = new double[5][2];
		for (int i = 0; i < points.length; i ++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		MyRectangle2D r = getRectangle(points);
		System.out.println("The bounding rectangle's center (" +
		r.getX() + ", " + r.getY() + "), width " + r.getWidth() + ", height " + r.getHeight());
		input.close();
	}
	public static MyRectangle2D getRectangle(double[][] points) {
		MyRectangle2D r = new MyRectangle2D();
		double minX = points[0][0];
		double minY = points[0][1];
		double maxX = points[0][0];
		double maxY = points[0][1];
		for (int i = 0; i < points.length; i++) {
			if (minX > points[i][0])
				minX = points[i][0];
			if (maxX < points[i][0])
				maxX = points[i][0];
			if (minY > points[i][1])
				minY = points[i][1];
			if (maxY < points[i][1])
				maxY = points[i][1];
		}
		double width = maxX - minX;
		double height = maxY - minY;
		double centerX = minX + width / 2;
		double centerY = minY + height / 2;
		r.setWidth(width);
		r.setHeight(height);
		r.setX(centerX);
		r.setY(centerY);
		return r;
	}
}
