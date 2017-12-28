package chapter5;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int integer = 4;
		int count = 0;
		double total = 0;
		int countPositive = 0;
		int countNegative = 0;
		System.out.print("Enter an integer, the input ends if it is 0: ");
		do {
			integer = input.nextInt();
			if (integer < 0) {
				total += integer;
				countNegative++;
				count++;
			}
			else if (integer > 0) {
				total += integer;
				countPositive++;
				count++;
			}
		} while (integer != 0);
		if (count == 0) {
			System.out.print("No numbers are entered except 0");
		}
		else {
			double average = total / count;
			System.out.println("The number of positives is " + countPositive);
			System.out.println("The number of negatives is " + countNegative);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
		}
		input.close();
		
	}
}
