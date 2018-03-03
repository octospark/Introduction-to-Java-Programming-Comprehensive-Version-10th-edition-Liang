package chapter12;

/**
 * @author Erlin Goce
 *
 * Mar 3, 2018 12:10:05 PM
 * 
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method
 * to throw a BinaryFormatException if the string is not a binary string.
 * Define a custom exception called BinaryFormatException. Implement the
 * bin2Dec method to throw a BinaryFormatException if the string is not a
 * binary string.
 */
public class Exercise12_09 {
	public static void main(String[] args) {
		try {
			System.out.println(binToDec("1101014"));
		}
		catch(BinaryFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
	/** Binary to decimal method */
	public static int binToDec(String str) throws BinaryFormatException {
		if (!str.matches("[0-1]*"))
			throw new BinaryFormatException(str);
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result  = result * 2 + Character.getNumericValue(str.charAt(i));
		}
		return result;
	}
}

class BinaryFormatException extends Exception{
	private String binaryStr;
	public BinaryFormatException(String binaryStr) {
		super("Error: Invalid binary format " + binaryStr);
	}
	public String getBinaryString() {
		return binaryStr;
	}
}