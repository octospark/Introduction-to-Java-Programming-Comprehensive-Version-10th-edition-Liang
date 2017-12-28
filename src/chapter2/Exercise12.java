package chapter2;
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration of airplane: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double length = speed * speed / (2 * acceleration);
		
		System.out.println("The length of the runway should be " + length +
				" meters");
		input.close();
	}
}
