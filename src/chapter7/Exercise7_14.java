package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five numbers: ");
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			
		}
		System.out.print("The gcd of these numbers is: " + gcd(numbers));
		input.close();
	}
	public static int gcd(int[] array) {
		int min = (int)Exercise7_09.min(array);
		int divisor = 2;
		int gcd = 1;
		while (divisor <= min) {
			boolean allTrue = true;
			for (int i = 0; i < array.length; i++) {
				if(array[i] % divisor != 0)
					allTrue = false;
			}
			if (allTrue)
				gcd = divisor;
			
			divisor++;
			
		}
		return gcd;
	}
}
