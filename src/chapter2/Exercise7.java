package chapter2;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int totalDays = minutes / (60 * 24);
		int years = totalDays / 365;
		int remainingDays = totalDays % 365;
		
		System.out.println(minutes + " minutes is approximately " + 
		years + " years and " + remainingDays + " days.");
		input.close();
	}
}
