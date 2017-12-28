package chapter5;

public class Exercise13 {
	public static void main(String[] args) {
		long n = 12000L;
		while (n * n * n > 12000) {
			n--;
		}
		System.out.println("The largest n such that n*n*n < 12000 is " + n);
	}
}
