package chapter2;
import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt for side length of the hexagon
		System.out.print("Enter side length of hexagon: ");
		double side = input.nextDouble();
		
		// Compute area
		double area = 3 * Math.pow(3, 0.5)  * Math.pow(side, 2) / 2;
		
		// Display result
		System.out.println("The area of the hexagon is " + area);
		input.close();
	}
}
