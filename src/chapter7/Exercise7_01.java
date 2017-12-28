package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 23, 2017
 */
public class Exercise7_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numebr of students: ");
		int n = input.nextInt();
		System.out.println("Enter " + n + " scores: ");
		double[] students = new double[n];
		for (int i = 0; i < students.length; i++) {
			students[i] = input.nextDouble();
		}
		double maxScore = max(students);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + i + " score is " +
		students[i] + " and grade is " + grade(students[i], maxScore));
		}
		input.close();
	}
	public static char grade(double score, double bestScore) {
		if (score >= bestScore - 10)
			return 'A';
		else if (score >= bestScore - 20)
			return 'B';
		else if (score >= bestScore - 30)
			return 'C';
		else if (score >= bestScore - 40)
			return 'D';
		else
			return 'F';
	}
	public static double max(double[] list) {
		double max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (max < list[i])
				max = list[i];
		}
		return max;
	}
}
