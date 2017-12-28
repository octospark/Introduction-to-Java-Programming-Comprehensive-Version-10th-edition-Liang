package chapter2;
import java.util.Scanner;


public class Exercise6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000 excluded: ");
		int number = input.nextInt();
		
		int firstDigit = number % 10;
		int remainingDigits = number / 10;
		int secondDigit = remainingDigits % 10;
		remainingDigits /= 10;
		
		int result = firstDigit + secondDigit + remainingDigits;
		System.out.println("The sum of digits of the number " + number +
				" is " + result);
		input.close();
	}
}
