package chapter10;

import java.math.BigInteger;

/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 1:44:36 PM
 */
public class Exercise10_17 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("" + Long.MAX_VALUE);
		BigInteger sqrt = number.sqrt();
		
		int count = 0;
		while (count < 9) {
			BigInteger squared = sqrt.multiply(sqrt);
			
			if (squared.compareTo(number) > 0) {
				System.out.println(squared);
				count++;
				}
			//System.out.println(squared);
			sqrt = sqrt.add(BigInteger.ONE);
		}
		System.out.println(Long.MAX_VALUE);
	}
}
