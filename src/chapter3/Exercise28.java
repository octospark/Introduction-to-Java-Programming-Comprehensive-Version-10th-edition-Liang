package chapter3;
import java.util.Scanner;

public class Exercise28 {
	public static void main(String[] args) {
		// Create a Scanner and get input for the two rectangles
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double xDistanceOfCenters = Math.pow(Math.pow((x1 - x2), 2), 0.5);
		double yDistanceOfCenters = Math.pow(Math.pow((y1 - y2), 2), 0.5);
		// The second rectangle inside the first one
		
		if ((xDistanceOfCenters + width2 <= width1) && (yDistanceOfCenters + height2 <= height1))
			System.out.println("r2 is inside r1");
		else if ((width1 + width2 >= xDistanceOfCenters) || (height1 + height2 >= yDistanceOfCenters))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
		
		input.close();
	}
}
