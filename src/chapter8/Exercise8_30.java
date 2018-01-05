package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 4:00:18 PM
 * (Algebra: solve linear equations) Write a method that solves the following
 * 2 * 2 system of linear equations:
 * a00x + a01y = b0
 * a10x + a11y = b1
 * x =(b0a11 - b1a01) /(a00a11 - a01a10)
 * y =(b1a00 - b0a10) / (a00a11 - a01a10)
 * public static double[] linearEquation(double[][] a, double[] b)
 * The method returns null if a00a11 - a01a10 is 0. Write a test program that
 * prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
 * a00a11 - a01a10 is 0, report that “The equation has no solution.”
 */
public class Exercise8_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a00, a11, a10 and a11: ");
		double[][] a = new double[2][2];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = input.nextDouble();
		System.out.print("Enter b0 and b1: ");
		double[] b = new double[2];
		for (int i = 0; i < b.length; i++)
			b[i] = input.nextDouble();
		if (linearEquation(a, b) == null)
			System.out.println("The system has no solutions");
		else {
			double[] solutions = linearEquation(a, b);
			System.out.println("The solutions are (" + solutions[0] + ", " +
			solutions[1] + ")");
		}
		input.close();
	}
	public static double[] linearEquation(double[][] a, double[] b) {
		double discriminator = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		if (discriminator == 0)
			return null;
		double x = (b[0] * a[1][1] - b[1]* a[0][1]) / discriminator;
		double y = (b[0] * a[1][1] - b[1]* a[0][1]) / discriminator;
		return new double[] {x, y};
	}
}
