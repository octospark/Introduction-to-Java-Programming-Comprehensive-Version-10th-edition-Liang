package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 28, 2017
 */
public class Exercise7_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b and c: ");
		double[] eqn = new double[3];
		double[] roots = new double[3];
		for (int i = 0; i < eqn.length; i++)
			eqn[i] = input.nextDouble();
		int response = solveQuadratic(eqn, roots);
		if (response == 2) {
			System.out.println("The roots are " + roots[0] + " and " + roots[1]);
		}
		else if (response == 1)
			System.out.println("The root is " + roots[2]);
		else
			System.out.println("The equation has no real solutions");
		input.close();
	}
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		double discriminant = b * b - 4 * a * c;
		
		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			roots[0] = root1;
			roots[1] = root2;
			return 2;
		}
		else if (discriminant == 0) {
			double root = (-b / (2 * a));
			roots[2] = root;
			return 1;
		}
		else
			return 0;
		
	}
}
