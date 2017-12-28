package chapter4;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the side of the hexagon: ");
		double side = input.nextDouble();
		
		// Calculate the area
		double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
		
		System.out.printf("The area of the hexagon is %.2f", area);
		input.close();
	}
}
