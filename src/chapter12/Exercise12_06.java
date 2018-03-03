package chapter12;

/**
 * @author Erlin Goce
 *
 * Mar 3, 2018 11:41:13 AM
 * 
 * (NumberFormatException) Listing 6.8 implements the hex2Dec(String
 * hexString) method, which converts a hex string into a decimal number.
 * Implement the hex2Dec method to throw a NumberFormatException if the
 * string is not a hex string.
 */
public class Exercise12_06 {
	public static void main(String[] args) {
		System.out.print(hexToDecimal("df"));
	}
	/** The hex to decimal method*/
	public static int hexToDecimal(String hex) throws NumberFormatException {
		if (!hex.matches("[0-9A-Fa-f]*"))
			throw new NumberFormatException("Invalid format for hex value");
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	/*The method converts single hex chars into decimals*/
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		}
		else
			return ch - '0';
	}
}
