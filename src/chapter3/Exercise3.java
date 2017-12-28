package chapter3;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		// Create a Scanner and ask for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Compute determinant and solutions
		double determinant = a * d - b * c;
		if (determinant != 0) {
			double x = (e * d - b * f) / determinant;
			double y = (a * f - e * c) / determinant;
			System.out.println("The solutions of the system are x = " + x + " and y = " + y);
		}
		else {
			System.out.println("The system has no solution");
		}
		input.close();
	}
}
