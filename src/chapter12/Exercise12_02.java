package chapter12;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 6:52:24 PM
 * 
 * (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */
public class Exercise12_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean operationOver = false;
		while (!operationOver) {
			try {
				System.out.print("Enter two integers: ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				
				int result = number1 + number2;
				System.out.println("The sum is " + result);
				operationOver = true;
			}
			catch(Exception ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				input.nextLine();
			}
		}
		input.close();
	}
}
