package chapter10;
import java.math.*;
/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 12:32:50 PM
 */
public class Exercise10_18 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("" + Long.MAX_VALUE).add(BigInteger.ONE);
		int count = 0;
		int countIterations = 0;
		while (count < 5) {
			if (isPrime(number)) {
				System.out.println(number);
				count++;
				}
			countIterations++;
			if (countIterations % 10 == 0)
				System.out.println(countIterations);
			number = number.add(BigInteger.ONE);
		}
		
	}
	public static boolean isPrime(BigInteger n) {
		BigInteger start = BigInteger.TWO;
		BigInteger sqrt = n.sqrt();
		while (start.compareTo(sqrt) <= 0) {
			if (n.remainder(start).equals(BigInteger.ZERO))
				return false;
			start = start.add(BigInteger.ONE);

		}
		return true;
	}
}
