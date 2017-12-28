package chapter7;

/**
 * @author pc
 *
 * Dec 25, 2017
 */
public class Exercise7_06 {
	public static void main(String[] args) {
		final int LIMIT = 10000000;
		int[] primes = new int[LIMIT];
		primes[0] = 2; // The first prime should be provided
		int count = 1;
		int number = 3;
		long startTime = System.currentTimeMillis();
		
		while (count < LIMIT) {
			if (isPrime(number, primes)) {
				primes[count] = number;
				count++;
				number++;
			}
			else
				number++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms");
		
	}
	/** Check the number for primeness from a growing list of primes*/
	public static boolean isPrime(int n, int[] list) {
		int count = 1;
		int primeElement = list[0];
		while (primeElement <= Math.sqrt(n)) {
			if (n % primeElement == 0)
				return false;
			else {
				primeElement = list[count];
				count++;
			}
		}
		
		return true;
	}
}
