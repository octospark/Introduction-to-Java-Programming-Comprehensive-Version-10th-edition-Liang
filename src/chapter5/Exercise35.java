package chapter5;

public class Exercise35 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 624; i++) {
			sum += 1.0 / (1 + Math.sqrt(i + 1));
		}
		System.out.print(sum);
	}
}
