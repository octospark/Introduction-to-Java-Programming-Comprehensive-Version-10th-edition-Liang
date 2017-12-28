package chapter5;

public class Exercise6 {
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.609;
		System.out.println("Miles     Kilometers  |  Kilometers      Miles");
		int kilometers = 20;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-10d%-10.3f  |  ", i, (i * KILOMETERS_PER_MILE));
			System.out.printf("%-2d%20.3f\n", kilometers, (kilometers / KILOMETERS_PER_MILE));
			kilometers += 5;
		}
	}
}
