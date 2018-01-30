package chapter10;
import java.math.*;
/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 2:40:46 PM
 */
public class Exercise10_20 {
	public static void main(String[] args) {
		BigDecimal decimal = new BigDecimal("0");
		decimal = decimal.setScale(2500);
		BigDecimal one = BigDecimal.ONE;
		
		for (int i = 0; i <= 3000; i++) {
			BigInteger factorial = LargeFactorial.factorial(i);
			BigDecimal denominator = new BigDecimal("" + factorial);
			@SuppressWarnings("deprecation")
			BigDecimal ratio = one.divide(denominator, 2500, BigDecimal.ROUND_UP);
			decimal = decimal.add(ratio);
			if (i != 0 && i % 100 == 0)
				System.out.println(decimal);
		}
	}
}
