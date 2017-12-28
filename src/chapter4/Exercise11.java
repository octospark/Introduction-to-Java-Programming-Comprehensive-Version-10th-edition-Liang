package chapter4;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		
		if (value >= 0 && value < 10) {
			System.out.println("The hex value is " + value);
		}
		else if(value >= 10 && value <= 15) {
			char answer = (char)(65 + value - 10);
			System.out.println("The hex value of " + value + " is " + answer);
		}
		else {
			System.out.println(value + " is an invalid input");
		}
		input.close();
	}
}
