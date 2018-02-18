package chapter11;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Feb 17, 2018 12:00:56 PM
 * 
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
 * if an answer is entered again
 */
public class Exercise11_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		list.add(answer);
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			
			if (list.contains(answer))
				System.out.println("You already entered " + answer);
			list.add(answer);
		}
		System.out.println("You got it!");
		input.close();
	}
}
