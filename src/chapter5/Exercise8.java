package chapter5;
import java.util.Scanner;
public class Exercise8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int studentsNum = input.nextInt();
		
		System.out.print("Enter the student's name: ");
		String name = input.next();
		System.out.print("Enter " +  name + " score");
		double score = input.nextDouble();
		
		double maxScore = score;
		String maxStudent = name;
		
		
		for (int i = 0; i < studentsNum - 1; i++) {
			System.out.print("Enter the student's name: ");
			name = input.next();
			System.out.print("Enter " +  name + " score");
			score = input.nextDouble();
			if (score > maxScore) {
				maxScore = score;
				maxStudent = name;
			}
		}
		System.out.println("The student with the highest score is " + maxStudent + " with " +
		maxScore + " points");
		input.close();
	}
}
