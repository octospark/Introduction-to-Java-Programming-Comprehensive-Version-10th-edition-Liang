package chapter5;
import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data;
		int sum = 0;
		
		// Keep reading data until the input is 0
		do {
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			sum += data;
		} while(data != 0);
		System.out.println("The sum is " + sum);
		input.close();
	}
}
