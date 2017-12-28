package chapter5;

public class Exercise15 {
	public static void main(String[] args) {
		int count = 0;
		final int CHARS_PER_LINE = 10;
		for (int i = 33; i <= 126; i++) {
			count++;
			if (count % CHARS_PER_LINE == 0) {
				System.out.println((char)i);
			}
			else {
				System.out.print((char)i + " ");
			}
		}
	}
}
