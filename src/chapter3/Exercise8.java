package chapter3;
import java.util.Scanner;
public class Exercise8 {
	public static void main(String[] args) {
		// Create a Scanner and input the numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compare and print the numbers in non-decreasing order
		if (number1 >= number2 && number2 >= number3)
			System.out.println(number3 + " " + number2 + " " + number1);
		else if (number1 >= number3 && number3 >= number2)
			System.out.println(number2 + " " + number3 + " " + number1);
		else if (number2 >= number1 && number1 >= number3)
			System.out.println(number3 + " " + number1 + " " + number2);
		else if (number2 >= number3 && number3 >= number1)
			System.out.println(number1 + " " + number3 + " " + number2);
		else if (number3 >= number1 && number1 >= number2)
			System.out.println(number2 + " " + number1 + " " + number3);
		else
			System.out.println(number1 + " " + number2 + " " + number3);
		input.close();
			
	}
}
