package chapter5;
import java.util.Scanner;
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int k = 2;
		int max = Math.max(n1, n2);
		if (n1 == n2)
			gcd = n1;
		else {
			while (k <= max/2) {
				if (n1 % k == 0 && n2 % k == 0)
					gcd = k;
				k++;
				}
			}
		System.out.println("The greatest common divisor for " + n1 + " and " +
		n2 + " is " + gcd);
		input.close();
	}
}
