package chapter12;

/**
 * @author Erlin Goce
 *
 * Mar 3, 2018 12:02:25 PM
 * 
 * (HexFormatException) Exercise 12.6 implements the hex2Dec method to
 * throw a NumberFormatException if the string is not a hex string. Define
 * a custom exception called HexFormatException. Implement the hex2Dec
 * method to throw a HexFormatException if the string is not a hex string.
 * 
 */
public class Exercise12_08 {
	public static void main(String[] args) {
		try {
			System.out.println(hexToDecimal("face"));
		}
		catch(HexFormatException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	/** The hex to decimal method*/
	public static int hexToDecimal(String hex) throws HexFormatException {
		if (!hex.matches("[0-9A-Fa-f]*"))
			throw new HexFormatException();
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

class HexFormatException extends Exception{
	public HexFormatException() {
		super("Error: The string is not in hex format");
	}
}
