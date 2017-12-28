/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise13 {
	public static void main(String[] args) {
		System.out.println("i          m(i)");
		System.out.println("---------------");
		for (int i = 1; i <= 20; i++)
			System.out.printf("%-5d%12.4f\n", i, harmonicSum(i));
	}
	public static double harmonicSum(int i) {
		double sum = 0;
		for (int k = 1; k <= i; k++) {
			sum += ((k * 1.0) / (k + 1));
		}
		return sum;
	}
}
