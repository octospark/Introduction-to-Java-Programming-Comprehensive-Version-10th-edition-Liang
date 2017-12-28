package chapter3;
import java.util.Scanner;
public class Exercise23 {
	public static void main(String[] args) {
		// Create a scanner to obtain the coordinates of the point from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates of the point: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Find the horizontal and vertical distance of the point from the center of the rectangle
		// and determine if the point is inside it
		
		double horizontalDistance = Math.pow(Math.pow((x - 0), 2), 0.5);
		double verticalDistance = Math.pow(Math.pow((y - 0), 2), 0.5);
		double width = 10;
		double height = 5;
		
		if (horizontalDistance <= (width / 2) && verticalDistance <= (height / 2))
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.println("Point (" + x + ", " + y + ") is outside the rectangle");
		
		input.close();
	}
}
