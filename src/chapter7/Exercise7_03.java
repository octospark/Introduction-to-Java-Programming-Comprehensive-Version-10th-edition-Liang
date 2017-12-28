package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 25, 2017
 */
public class Exercise7_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] integers = new int[100];
		int number = input.nextInt();
		while (number != 0) {
			integers[number - 1]++;
			number = input.nextInt();
		}
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] != 0) {
				int n = (i + 1);// the number is the index plus one
				System.out.println(n + " occurs " + integers[i] + formatNumber(integers[i]));
			}
		}
		input.close();
	}
	public static String formatNumber(int n) {
		if (n == 1)
			return " time";
		else
			return " times";
	}
}
