package chapter4;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String charString = input.nextLine();
		char character = charString.charAt(0);
		
		System.out.println("The unicode for character " + character + " is " + (int)character);
		input.close();
	}
}
