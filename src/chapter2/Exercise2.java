package chapter2;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Get input for the radius and length of cylinder
		System.out.print("Enter radius and length of the cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		// Compute areas and volume
		final double PI = 3.1415926;
		double areaBase = radius * radius * PI;
		double totalArea = 2 * areaBase + 2 * PI * radius * length;
		double volume = areaBase * length;
		
		// Display results
		System.out.println("The area is " + totalArea);
		System.out.println("The volume is " + volume);
		input.close();
	}
}
