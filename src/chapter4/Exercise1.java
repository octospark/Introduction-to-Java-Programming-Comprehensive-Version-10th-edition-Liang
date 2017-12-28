package chapter4;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from center to a vertex: ");
		double r = input.nextDouble();
		
		// Calculate the side of the pentagon and then the area
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		
		// Display the area
		System.out.printf("The area of the pentagon is %4.2f", area);
		input.close();
	}
}
