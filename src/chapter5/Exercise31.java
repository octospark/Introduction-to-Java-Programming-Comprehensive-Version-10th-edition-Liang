package chapter5;
import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount of investment into a CD: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double yield = input.nextDouble();
		
		System.out.print("Enter maturity perriod (in months): ");
		int months = input.nextInt();
		
		double monthlyYield = yield / 1200;
		System.out.println("Month  CD Value");
		for (int month = 1; month <= months; month++) {
			double value = amount * Math.pow((1 + monthlyYield), month);
			System.out.printf("%-5d%10.2f\n", month, value);
		}
		input.close();
	}
}
