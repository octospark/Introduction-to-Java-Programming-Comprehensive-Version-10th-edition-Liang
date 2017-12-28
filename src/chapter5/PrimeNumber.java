package chapter5;

public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50000;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2; // A number tested for primeness
		System.out.println("The first 50 prime numbers are \n");
		
		// Repeatedly find prime numbers
		while(count < NUMBER_OF_PRIMES) {
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
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}
