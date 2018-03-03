package chapter12;

/**
 * @author Erlin Goce
 *
 * Mar 3, 2018 11:49:03 AM
 * 
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 */
public class Exercise12_07 {
	public static void main(String[] args) {
		System.out.println(binToDec("211"));
	}
	/** Binary to decimal method */
	public static int binToDec(String str) throws NumberFormatException {
		if (!str.matches("[0-1]*"))
			throw new NumberFormatException();
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result  = result * 2 + Character.getNumericValue(str.charAt(i));
		}
		return result;
	}
}
