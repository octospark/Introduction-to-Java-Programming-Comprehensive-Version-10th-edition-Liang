/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise14 {
	public static void main(String[] args) {
		System.out.println("i           m(i)");
		System.out.println("----------------");
		int i = 1;
		for (i = 1; i < 1000; i += 100) {
			System.out.printf("%-5d%12.4f\n", i, estimatePi(i));
		}
	}
	public static double estimatePi(int i) {
		double sum = 0;
		for (int k = 1; k <= i; k++) {
			sum += Math.pow(-1, (k + 1)) / (2 * k - 1);
		}
		return 4 * sum;
	}
}
