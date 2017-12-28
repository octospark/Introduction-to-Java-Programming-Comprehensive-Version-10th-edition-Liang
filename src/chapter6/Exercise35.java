/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side: ");
		double side = input.nextDouble();
		System.out.print("The area of the pentagon is " + area(side));
		input.close();
	}
	public static double area(double side) {
		double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
		return area;
	}
}
