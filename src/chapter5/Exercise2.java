package chapter5;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;//Count the number of correct answers
		int count = 0;// count the number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; // output string is initially empty
		
		while (count < NUMBER_OF_QUESTIONS) {
			// 1. Generate two random single digit integers
			int number1 = (int)(Math.random() * 15 + 1);
			int number2 = (int)(Math.random() * 15 + 1);
			
			
			// 2. Prompt the student to answer "What is number1 + number2?"
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();
			
			// 3. Grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct!\n");
				correctCount++;
			}
			else {
				System.out.println("\nYour answer is wrong.\n" + number1 + 
						" + " + number2 + " should be " + (number1 + number2));
			}
			// Increase the question count
			count++;
			
			output += "\n" + number1 + " + " + number2 + " = " + answer +
					((number1 + number2 == answer) ? " correct": " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount + "\nTest time is " + 
				testTime / 1000 + " seconds\n" + output);
		input.close();
	}
}
