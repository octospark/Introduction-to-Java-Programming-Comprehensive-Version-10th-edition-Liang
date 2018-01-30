package chapter10;

import java.math.BigInteger;

/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 3:55:58 PM
 */
public class Exercise10_21 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("" + Long.MAX_VALUE).add(BigInteger.ONE);
		int count = 0;
		while (count < 10) {
			if (number.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || 
					number.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
				count++;
				System.out.println(number.toString());
			}
			number = number.add(BigInteger.ONE);
		}
	}
}
