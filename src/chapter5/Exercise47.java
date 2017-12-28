package chapter5;
import java.util.Scanner;
/*
 * This program calculates the ISBN-13 code given a
 * 12 digit code
 */
public class Exercise47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.next();
		
		if (isbn.length() != 12) {
			System.out.println(isbn + " is an invalid input");
			System.exit(1);
		}else {
			int partialChecksum = 0;
			long decimalFormISBN = Long.parseLong(isbn);
			for (int i = 1; i <= isbn.length(); i++) {
				long digit = decimalFormISBN % 10;
				if(i % 2 == 0) {
					partialChecksum += 3 * digit;
				}
				else {
					partialChecksum += digit;
				}
				decimalFormISBN /= 10;
			}
			int checkSum = 10 - partialChecksum % 10;
			if (checkSum == 10)
				checkSum = 0;
			String isbn13 = isbn + checkSum;
			System.out.println("The ISBN-13 number is " + isbn13);
			input.close();
		}
	}
}
