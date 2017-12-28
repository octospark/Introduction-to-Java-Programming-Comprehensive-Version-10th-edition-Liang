package chapter5;
import java.util.Scanner;
public class Exercise50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int upperCaseNumber = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				upperCaseNumber++;
		}
		System.out.println("The number of uppercase letters is " + upperCaseNumber);
		input.close();
	}
}
