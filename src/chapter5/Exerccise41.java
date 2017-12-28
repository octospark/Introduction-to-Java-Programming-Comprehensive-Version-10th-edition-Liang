package chapter5;
import java.util.Scanner;
public class Exerccise41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some numbers, 0 ends the input: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		while(number != 0) {
			if (number > max) {
				count = 1;
				max = number;
			}
			else if (number == max){
				count++;
			}
			number = input.nextInt();
		}
		System.out.print("The max number is " + max + " and it occurs " + count + " times");
		input.close();
	}
}
