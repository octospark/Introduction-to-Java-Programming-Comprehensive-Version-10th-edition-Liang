package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 25, 2017
 */
public class Exercise7_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter scores: ");
		double[] scores = new double[100];
		double score = input.nextDouble();
		int count = 0;
		while (score >= 0) {
			scores[count] = score;
			count++;
			score = input.nextDouble();
		}
		input.close();
		double average = sum(scores) / count;
		int aboveAverage = 0;
		int belowAverage = 0;
		for (int i = 0; i < scores.length; i++)
			if (scores[i] != 0) {
				if (scores[i] >= average)
					aboveAverage++;
				else
					belowAverage++;
			}
		System.out.println("The average is " + average);
		System.out.println("There are " + aboveAverage + " scores above or equal to average and " +
			belowAverage + " scores below average");
		input.close();
	}
	public static double sum(double[] list) {
		double sum = 0;
		for (int i = 0; i < list.length; i++)
			sum += list[i];
		return sum;
	}
}
