package chapter4;
import java.util.Scanner;
public class Exercise20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = input.nextLine();
		
		System.out.println("The length of the string is " + str.length() + " and its first character" +
		" is " + str.charAt(0));
		input.close();
	}
}
