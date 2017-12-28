package chapter4;
import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides of the polygon: ");
		double numOfSides = input.nextDouble();
		
		System.out.print("Enter length of side: ");
		double length = input.nextDouble();
		
		// Calculate area
		double area = (numOfSides * length * length) / (4 * Math.tan(Math.PI / numOfSides));
		
		System.out.println("The area of the polygon is " + area);
		input.close();
	}
}
