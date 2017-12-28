package chapter5;
import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		long number = input.nextLong();
		long factor = 2;
		long startTime = System.currentTimeMillis();
		while (number != 1) {
			while (number % factor == 0) {
				System.out.println(factor + "*");
				number /= factor;
			}
			factor++;
		}
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime) / 1000;
		System.out.print(duration + " seconds");
		input.close();
	}
}
