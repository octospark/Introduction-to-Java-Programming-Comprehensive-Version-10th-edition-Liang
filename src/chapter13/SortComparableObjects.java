package chapter13;
import java.math.*;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Mar 13, 2018 2:32:46 PM
 */
public class SortComparableObjects {
	public static void main(String[] args) {
		String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
		Arrays.sort(cities);
		for (String city: cities)
			System.out.print(city + " ");
		System.out.println();
		
		BigInteger[] hugeNumbers = {new BigInteger("5168716871657167"),
				new BigInteger("51168716541687"), new BigInteger("454747123")};
		for (BigInteger number: hugeNumbers)
			System.out.print(number + " ");
	}
}
