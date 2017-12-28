package chapter4;
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade(A, B, C, D or F): ");
		char grade = input.nextLine().charAt(0);
		
		int gradeNumber = -1;
		
		switch(grade) {
		case 'A':
			gradeNumber = 4;
			break;
		case 'B':
			gradeNumber = 3;
			break;
		case 'C':
			gradeNumber = 2;
			break;
		case 'D':
			gradeNumber = 1;
			break;
		case 'F':
			gradeNumber = 0;
			break;
		}
		if (gradeNumber != -1) {
			System.out.println("The numeric value for grade " + grade + " is " + gradeNumber);
		}
		else {
			System.out.println(grade + " is an invalid grade");
		}
		input.close();
	}
}
