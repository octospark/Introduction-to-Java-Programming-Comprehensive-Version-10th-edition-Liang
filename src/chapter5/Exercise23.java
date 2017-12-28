package chapter5;

public class Exercise23 {
	public static void main(String[] args) {
		int limit = 500000;
		double sumLeftToRight = 0;
		double sumRightToLeft = 0;
		for (int i = 1; i <= limit; i++) {
			sumLeftToRight += (1.0 / i);
			sumRightToLeft += (1.0 / (limit + 1 - i));
		}
		System.out.println("Right to left sum: " + sumRightToLeft);
		System.out.println("Left to right sum: " + sumLeftToRight);
	}
}
