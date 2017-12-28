package chapter3;
import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		// Create a scanner and get the input from the user 
		// regarding four points for two lines
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Calculate in intermediate variables
		double a = (y1 - y2);
		double b = (x2 - x1);
		double c = (y3 - y4);
		double d = (x4 - x3);
		
		double e = a * x1 + b * y1;
		double f = c * x3 + d * y3;
		
		// Compute determinant and find intersection if there is one or
		// else the lines are parallel
		
		double determinant = a * d - b * c;
		if (determinant != 0) {
			double x = (e * d - b * f) / determinant;
			double y = (a * f - e * c) / determinant;
			System.out.println("The intersection point  is at (" + x + ", " + y + ")");
		}
		else {
			System.out.println("The two lines are parallel");
		}
		input.close();
	}
}
