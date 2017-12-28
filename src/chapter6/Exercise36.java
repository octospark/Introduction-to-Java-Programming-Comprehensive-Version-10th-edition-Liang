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
public class Exercise36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of sides: ");
		int n = input.nextInt();
		
		System.out.print("Enter the side length: ");
		double side = input.nextDouble();
		System.out.println("The area of the polygon with " + n + " sides is " + area(n, side));
		input.close();
	}
	public static double area(int n, double side) {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
}
