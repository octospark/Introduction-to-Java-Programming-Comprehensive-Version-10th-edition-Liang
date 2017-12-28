package chapter5;
import java.util.Scanner;
/*A decimal to binary converter
 * */
public class Exercise37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();
		int copy = decimal;
		String binary = "";
		while (decimal != 0) {
			int digit = decimal % 2;
			binary = digit + binary;
			decimal /= 2;
		}
		System.out.println("The binary representation of " + copy + " is " + binary);
		System.out.print(Integer.toBinaryString(copy));
		input.close();
	}
}
