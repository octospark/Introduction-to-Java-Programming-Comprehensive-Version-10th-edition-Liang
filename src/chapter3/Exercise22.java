package chapter3;
import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		// Create a Scanner and obtain the point from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		
		// The circle is centered at (0, 0) with radius 10. Verify if the point
		// is within the circle by measuring the distance of the point from the center of the circle
		// and comparing it with the radius of the circle
		
		double distance = Math.pow(Math.pow((x - 0), 2) + Math.pow((y - 0), 2), 0.5);
		double radius = 10;
		
		if (distance > radius)
			System.out.println("The point (" + x + ", " + y + ") is outside the circle");
		else
			System.out.println("The point (" + x + ", " + y + ") is inside the circle");
		
		input.close();
			
		
	}
}
