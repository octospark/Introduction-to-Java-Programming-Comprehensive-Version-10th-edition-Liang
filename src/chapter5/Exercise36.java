package chapter5;

import java.util.Scanner;

public class Exercise36 {
	public static void main(String[] args) {
		// Create a Scanner object and ask user to input the 9-digit
		// ISBN code
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String number = input.next();
		
		int nineDigitNumber = Integer.parseInt(number);
		
		// Extract the nine digits, calculate checksum and append it
		// to the old 9-digit ISBN number
		int checkSum = 0;
		for (int i = 9; i >= 1; i--) {
			int d = nineDigitNumber % 10;
			checkSum += i * d;
			nineDigitNumber /= 10;
			
		}
		checkSum %= 11;
		if (checkSum == 10)
			System.out.println("The ISBN-10 number is " + number +  "X");
		else
			System.out.println("The ISBN-10 number is " + number + checkSum);
		input.close();
	}
}
