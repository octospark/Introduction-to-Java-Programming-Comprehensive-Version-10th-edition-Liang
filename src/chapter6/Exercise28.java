/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import chapter6.PrimeNumberMethod;
/**
 * @author pc
 *
 */
public class Exercise28 {
	public static void main(String[] args) {
		System.out.println("p           2^p - 1");
		for (int i = 1; i <= 31; i++) {
			int mersenne = (int)(Math.pow(2, i) - 1);
			if (PrimeNumberMethod.isPrime(mersenne)) {
				System.out.printf("%-10d%10d\n", i, mersenne);
			}
		}
	}
}
