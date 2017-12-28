package chapter5;

public class Exercise10 {
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int count = 1;
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				if (count % NUMBERS_PER_LINE == 0) {
					System.out.println(i);
				}
				else {
					System.out.print(i + " ");
				}
				count++;
			}
		}
	}
}
