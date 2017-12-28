package chapter4;
import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int asciiCode = input.nextInt();
		
		System.out.println("The character for ASCII code " + asciiCode + " is " + (char)asciiCode);
		input.close();
	}
}
