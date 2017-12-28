package chapter5;
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n1 and n2: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int minimum = Math.min(n1, n2);
		int gcd = 1;
		
		while (minimum >= 1) {
			if(n1 % minimum == 0 && n2 % minimum == 0) {
				gcd = minimum;
				break;
			}
			minimum--;
		}
		System.out.println("The gcd for " + n1 + " and " + n2 + " is " + gcd);
		input.close();
	}
}
