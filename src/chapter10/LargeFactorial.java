package chapter10;
import java.math.*;
/**
 * @author Erlin Goce
 *
 * Jan 27, 2018 2:08:01 PM
 */
public class LargeFactorial {
	public static void main(String[] args) {
		System.out.println("150! is \n" + factorial(150));
	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}
}
