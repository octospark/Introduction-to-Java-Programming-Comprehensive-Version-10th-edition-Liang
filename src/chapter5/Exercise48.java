package chapter5;
import java.util.Scanner;
public class Exercise48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String odd = "";
		for (int i = 0; i < str.length(); i++) {
			if((i + 1) % 2 != 0)
				odd += str.charAt(i);
		}
		System.out.println(odd);
		input.close();
	}
}
