package chapter5;

public class Exercise24 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 97; i+=2) {
			sum += ((i * 1.0) / (i + 2));
		}
		System.out.println(sum);
	}
}
