package chapter5;

public class Exercise25 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 10000000; i++) {
			sum += Math.pow((-1), (i + 1)) / ((2 * i - 1) * 1.0);
			if (i % 10000 == 0) {
				System.out.println(i + "   " +  (sum * 4));
			}
		}
	}
}
