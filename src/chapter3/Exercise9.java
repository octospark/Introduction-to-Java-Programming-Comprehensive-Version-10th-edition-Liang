package chapter3;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		// Create a Scanner object and ask user to input the 9-digit
		// ISBN code
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int nineDigitNumber = input.nextInt();
		
		// Extract the nine digits, calculate checksum and append it
		// to the old 9-digit ISBN number
		int d9 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d8 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d7 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d6 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d5 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d4 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d3 = nineDigitNumber % 10;
		nineDigitNumber /= 10;
		int d2 = nineDigitNumber % 10;
		int d1 = nineDigitNumber / 10;
		
		int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 +
				d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if (checkSum == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 +
					d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + 
					d5 + d6 + d7 + d8 + d9 + checkSum);
		input.close();
	}
}
