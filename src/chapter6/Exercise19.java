/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if (isValid(side1, side2, side3))
			System.out.println("The area of the triangle is " + area(side1, side2, side3));
		else
			System.out.print("The sides given do not form a triangle");
		input.close();
	}
	
	/** Return true if the sides given form a triangle*/
	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 == side3 || side1 + side3 == side2 || side2 + side3 == side1)
			return false;
		else
			return true;
	}
	/** Calculate the area of a triangle given the sides*/
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
}
