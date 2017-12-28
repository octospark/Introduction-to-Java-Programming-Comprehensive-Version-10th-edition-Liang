package chapter3;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculate roots
		double discriminator = Math.pow(b, 2) - 4 * a * c;
		if (discriminator > 0) {
			double r1 = (-b + Math.pow(discriminator, 0.5)) / 2 * a;
			double r2 = (-b - Math.pow(discriminator, 0.5)) / 2 * a;
			System.out.println("The equation has two roots: " + r1 + " and " + r2);
		}
		else if (discriminator == 0) {
			double r = (-b) / 2 * a;
			System.out.println("The only solution is " + r);
		}
		else
			System.out.println("The equation has no real roots");
		input.close();
		
	}
}
