package chapter5;
/* 
 * A program to find all perfect numbers under 10000
 * A perfect number is one whose divisors including 1
 * and excluding itself add up to the number itself
  */
public class Exercise33 {
	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
			int sum = 0;
			int divisor = 1;
			while (divisor <= i / 2) {
				if (i % divisor == 0) {
					sum += divisor;
				}
				divisor++;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}
