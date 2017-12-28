package chapter5;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Exter ten number: ");
		double sumOfSquares = 0;
		double sumOfNumbers = 0;
		for (int i = 0; i < 10; i++) {
			double number = input.nextDouble();
			sumOfSquares += Math.pow(number, 2);
			sumOfNumbers += number;
		}
		double sumOfNumbersSquared = Math.pow(sumOfNumbers, 2);
		double mean = sumOfNumbers / 10;
		double deviation = Math.sqrt((sumOfSquares - sumOfNumbersSquared / 10) / (10 - 1));
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
		input.close();
	}
}
