package chapter6;
import chapter6.PrimeNumberMethod;
public class Exercise10 {
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int number = 2;
		int count = 0;
		while (number < 10000) {
			if (PrimeNumberMethod.isPrime(number)) {
				System.out.printf("%5d", number);
				count++;
				if (count % NUMBERS_PER_LINE== 0) {
					System.out.println();
				}
			}
			
			number++;
		}
	}
}
