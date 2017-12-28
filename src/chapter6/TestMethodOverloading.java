/**
 * Made by Erlin Goce
 * Dec 20, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class TestMethodOverloading {
	public static void main(String[] args) {
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));
	}
	public static int max(int n1, int n2) {
		int result = (n1 > n2) ? n1:n2;
		return result;
	}
	public static double max(double n1, double n2) {
		double result = (n1 > n2) ? n1:n2;
		return result;
	}
	public static double max(double n1, double n2, double n3) {
		double result1 = (n1 > n2) ? n1:n2;
		double result = (result1 > n3) ? result1 : n3;
		return result;
	}
}
