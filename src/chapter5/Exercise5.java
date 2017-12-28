package chapter5;

public class Exercise5 {
	public static void main(String[] args) {
		final double POUNDS_PER_KILO = 2.2;
		System.out.println("Kilograms   Pounds    |    Pounds      Kilograms");
		int pounds = 20;
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%-3d%15.1f    |    ", i, (i * POUNDS_PER_KILO));
			System.out.printf("%-3d%18.2f\n", pounds, (pounds / POUNDS_PER_KILO));
			pounds += 5;
		}
	}
}
