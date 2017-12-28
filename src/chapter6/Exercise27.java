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
public class Exercise27 {
	public static void main(String[] args) {
		final int EMIRP_LIMIT = 100;
		int count = 0;
		int number= 2;
		while (count < EMIRP_LIMIT) {
			if (PrimeNumberMethod.isPrime(number) && PrimeNumberMethod.isPrime(reverse(number))) {
				count++;
				System.out.printf("%5d", number);
				if (count % 10 == 0)
					System.out.println();
			}
			number++;
		}
	}
	public static int reverse(int number) {
		String n = "" + number;
		String num = "";
		for (int i = 0; i < n.length(); i++) {
			num = n.charAt(i) + num;
		}
		return Integer.parseInt(num);
	}
}
