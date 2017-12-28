package chapter2;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double FOOT_PER_METER = 0.305;
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * FOOT_PER_METER;
		
		System.out.println(feet + " feet is " + meters + " meters.");
		input.close();
	}
}
