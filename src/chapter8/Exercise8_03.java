package chapter8;

/**
 * @author Erlin Goce
 *
 * Jan 1, 2018 6:08:40 PM
 */
public class Exercise8_03 {
	public static void main(String[] args) {
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
				
		// Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		int[][] studentsAndGrades = new int[answers.length][2];
		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			studentsAndGrades[i][0] = i;
			studentsAndGrades[i][1] = correctCount;
		}
		selectionSort(studentsAndGrades);
		for (int i = 0; i < studentsAndGrades.length; i++)
			System.out.println("Student " + studentsAndGrades[i][0] + "'s score is " +
		studentsAndGrades[i][1]);
	}
	public static void selectionSort(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int currentMinScore = array[i][1];
			int currentMinIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (currentMinScore > array[j][1]) {
					currentMinScore = array[j][1];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				array[currentMinIndex][1] = array[i][1];
				array[currentMinIndex][0] = i;
				array[i][1] = currentMinScore;
				array[i][0] = currentMinIndex;
			}
		}
	}
}
