package chapter3;
import java.util.Scanner;

public class Exercise27 {
	public static void main(String[] args) {
		// Get the point from the user and determine if it is inside the 
		// right triangle at points(0, 0), (0, 100) and (200, 0)
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates x, y of the point: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean outside = false;
		double yLine = -1 / 2.0 * x + 100;
		if (x < 0 || y < 0)
			outside = true;
		else {
			if (yLine  < y)
				outside = true;
		}
		if (!outside)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is outside the triangle");
		
		input.close();
	}
}
