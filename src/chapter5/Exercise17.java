package chapter5;
import java.util.Scanner;
public class Exercise17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 1 to 15: ");
		int number = input.nextInt();
		// 1. The program will create a number of lines of output for the pyramid
		for (int i = 1; i <= number; i++) {
			String line = "";
			//2. First create the leading spaces
			for (int j = number - i; j >= 1; j--) {
				line += "    ";
			}
			//3.Create the number pattern for the pyramid
			// The total length of numbers per line is i * 2 - 1
			int length = i * 2 - 1;
			int counter = i;
			for (int k = 1; k <= length; k++) {
				if (i <= k) {
					line += String.format("%4d", counter);
					counter++;
				}
				else {
					line += String.format("%4d", counter);
					counter--;
				}
			}
			System.out.println(line);
		}
		input.close();
	}
}
