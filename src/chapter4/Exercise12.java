package chapter4;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();
		
		// Check if the string has exactly one character
		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
		// Display the decimal value for the hex digit
		char ch = Character.toUpperCase(hexString.charAt(0));
		if (ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			String number = "";
			number = value % 2 + number;
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			
			System.out.println("The binary value for the hex digit " 
					+ ch + " is " + number);
		}
		else if (Character.isDigit(ch)) {
			int value = (int)ch;
			String number = "";
			number = value % 2 + number;
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			if (value / 2 != 0) {
				value /= 2;
				number = value % 2 + number;
			}
			
			System.out.println("The binary value for the hex digit " 
					+ ch + " is " + number);
		}
		else {
			System.out.println(ch + " is an invalid input");
		}
		input.close();
	}
}
