package chapter5;
/*
 * This program will reverse a string
 */
import java.util.Scanner;
public class Exercise46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int length = str.length();
		String reversed = "";
		for (int i = length - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("The reversed string is " + reversed);
		input.close();
	}
}
