package chapter3;
import java.util.Scanner;
public class Exercise29 {
	public static void main(String[] args) {
		// Get the radii of the circles and the coordinates of their centers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		// Determine if the second circle is inside the first, overlaps it
		// or does not overlap it.
		double distanceOfCenters = Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5);
		
		if (distanceOfCenters + radius2 <= radius1)
			System.out.println("circle2 is inside circle1");
		else if (distanceOfCenters > radius1 + radius2)
			System.out.println(" circle2 does not overlap circle1");
		else
			System.out.println("circle2 overlaps circle1");
		
		input.close();
	}
}
