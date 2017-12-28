package chapter5;
import java.util.Scanner;

public class DecToHex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a decimal number
		System.out.print("Enter a decimal: ");
		int decimal = input.nextInt();
		
		String hex = "";
		int count = 0;
		while (decimal != 0) {
			int hexValue = decimal % 16;
			
			// Convert a decimal value to a hex digit
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
					(char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
					
			hex = hexDigit + hex;
			decimal /= 16;
			count++;
		}
		System.out.println("The hex number is " + hex);
		System.out.print("Loop executed " + count + " times");
		input.close();
	}
}
