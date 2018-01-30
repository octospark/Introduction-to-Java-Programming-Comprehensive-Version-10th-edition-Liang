package chapter10;
import java.math.*;
/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 12:18:09 PM
 */
public class Exercise10_16 {
	public static void main(String[] args) {
		String startingInteger = "1";
		for (int i = 0; i < 49; i++)
			startingInteger += "0";
		BigInteger number = new BigInteger(startingInteger);
		int count = 0;
		while (count < 10) {
			if (number.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || 
					number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
				count++;
				System.out.println(number.toString());
			}
			number = number.add(BigInteger.ONE);
		}
	}
}
