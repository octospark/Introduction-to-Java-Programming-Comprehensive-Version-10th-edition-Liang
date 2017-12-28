package chapter4;
import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String first = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String second = input.nextLine();
		
		System.out.print("Enter the third city: ");
		String third = input.nextLine();
		
		// Compare cities and print them in alphabetical order
		double firstWithSecond = first.compareToIgnoreCase(second);
		double firstWithThird = first.compareToIgnoreCase(third);
		double secondWithThird = second.compareToIgnoreCase(third);
		
		if (firstWithSecond <= 0 && secondWithThird <= 0)
			System.out.println(first + " " + second + " " + third);
		else if (firstWithSecond <= 0 && secondWithThird > 0)
			System.out.println(first + " " + third + " " + second);
		else if (firstWithSecond > 0 && firstWithThird <= 0)
			System.out.println(second + " " + first + " " + third);
		else if (firstWithThird > 0 && secondWithThird <= 0)
			System.out.println(second + " " + third + " " + first);
		else if (secondWithThird > 0 && firstWithSecond > 0)
			System.out.println(third + " " + second + " " + first);
		else
			System.out.println(third + " " + first + " " + second);
		input.close();
	}
}
