package chapter2;
import java.util.Scanner;
public class Exercise13 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		
		double monthlyInterest = 0.05 / 12;
		double firstMonth = amount * (1 + monthlyInterest);
		double secondMonth = (amount + firstMonth) * (1 + monthlyInterest);
		double thirdMonth = (amount + secondMonth) * (1 + monthlyInterest);
		double fourthMonth = (amount + thirdMonth) * (1 + monthlyInterest);
		double fifthMonth = (amount + fourthMonth) * (1 + monthlyInterest);
		double sixthMonth = (amount + fifthMonth) * (1 + monthlyInterest);
		sixthMonth = (int)(sixthMonth * 100) / 100.0;
		System.out.println("After the sixth month the balance is $" + sixthMonth);
		input.close();
	}
}
