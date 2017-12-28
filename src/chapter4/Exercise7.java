package chapter4;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		// 1. find the angles of all the points.
		double sepAngle = Math.PI * 2 / 5; // this is the angle that each side subtends
		double first = Math.PI / 2 - sepAngle;
		double second = Math.PI / 2;
		double third = Math.PI / 2 + sepAngle;
		double fourth = Math.PI / 2 + 2 * sepAngle;
		double fifth = Math.PI / 2  + 3 * sepAngle;
		
		//2. find the points
		double x1 = radius * Math.cos(first);
		double y1 = radius * Math.sin(first);
		double x2 = radius * Math.cos(second);
		double y2 = radius * Math.sin(second);
		double x3 = radius * Math.cos(third);
		double y3 = radius * Math.sin(third);
		double x4 = radius * Math.cos(fourth);
		double y4 = radius * Math.sin(fourth);
		double x5 = radius * Math.cos(fifth);
		double y5 = radius * Math.sin(fifth);
		
		//3. Print the results
		System.out.println("The coordinates of the five points of the pentagon are ");
		System.out.println("(" + x1 + ", " + y1 + ")");
		System.out.println("(" + x2 + ", " + y2 + ")");
		System.out.println("(" + x3 + ", " + y3 + ")");
		System.out.println("(" + x4 + ", " + y4 + ")");
		System.out.println("(" + x5 + ", " + y5 + ")");
		input.close();
	}
}
