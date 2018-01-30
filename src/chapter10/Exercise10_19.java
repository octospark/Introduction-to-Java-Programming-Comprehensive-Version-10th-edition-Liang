package chapter10;
import java.math.*;

/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 2:05:17 PM
 */
public class Exercise10_19 {
	public static void main(String[] args) {
		
		BigInteger two = BigInteger.TWO;
		for (int i = 2; i <= 100; i++) {
			BigInteger mersenne = two.pow(i).subtract(BigInteger.ONE);
			if (Exercise10_18.isPrime(mersenne))
				System.out.println(i + "  " + mersenne);
		}
	}
}
