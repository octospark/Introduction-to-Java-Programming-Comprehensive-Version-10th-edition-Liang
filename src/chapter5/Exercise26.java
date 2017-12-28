package chapter5;

public class Exercise26 {
	public static void main(String[] args) {
		double factor = 1.0;
		double sum = 0;
		for (long i = 1; i <= 100000; i++) {
			sum += 1 * 1.0 / factor;
			factor *= i;
			if (i % 10000 == 0) {
				System.out.println(i + "    " + sum);
			}
		}
	}
}
