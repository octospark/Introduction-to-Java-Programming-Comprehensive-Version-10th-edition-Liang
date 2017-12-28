package chapter3;
import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		// Obtain input for the three edges of the triangle
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the three edges of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Test to see if the sides for a triangle or not 
		// and display the results for the perimeter
		
		if (side1 == side2 + side3 || side2 == side1 + side3 || side3 == side1 + side2)
			System.out.println("The edges do not form a triangle");
		else
			System.out.println("The perimeter is " + (side1 + side2 + side3));
		
		input.close();
		
		
	}
}
