package chapter5;

public class Exercise20 {
	public static void main(String[] args) {
		final int LIMIT = 1000;
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		int count = 0;
		int number = 2; // A number tested for primeness
		System.out.println("The primes smaller than 1000 are\n");
		
		// Repeatedly find prime numbers
		while(number <= LIMIT) {
			// Assume the number is prime
			boolean isPrime = true;
			
			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			// Display the prime number and increase the count
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%4d\n", number);
				}
				else
					System.out.printf("%4d", number);
			}
			number++;
		}
	}
}
