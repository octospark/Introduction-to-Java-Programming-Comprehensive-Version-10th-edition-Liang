package chapter5;

public class Exercise3 {
	public static void main(String[] args) {
		final double POUNDS_PER_KILO = 2.2;
		String header = "Kilograms   Pounds";
		System.out.println(header);
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%-3d%15.1f\n", i, (i * POUNDS_PER_KILO));
		}
	}
}
