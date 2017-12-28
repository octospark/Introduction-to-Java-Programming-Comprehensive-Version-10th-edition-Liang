package chapter5;

import java.util.Scanner;

public class Exercise38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();
		int copy = decimal;
		String binary = "";
		while (decimal != 0) {
			int digit = decimal % 8;
			binary = digit + binary;
			decimal /= 8;
		}
		System.out.println("The octal representation of " + copy + " is " + binary);
		System.out.print(Integer.toOctalString(copy));
		input.close();
	}
}
