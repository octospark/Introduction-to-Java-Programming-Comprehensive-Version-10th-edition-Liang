package chapter5;

public class Exercise4 {
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.609;
		System.out.println("Miles       Kilometres");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-12d%.3f\n", i, (i * KILOMETERS_PER_MILE));
		}
	}
}
