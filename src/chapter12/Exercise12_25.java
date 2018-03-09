package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 6:00:10 PM
 * 
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
 * member’s first name, last name, rank, and salary (see Programming Exercise
 * 12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and all faculty, respectively.
 */
public class Exercise12_25 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chapter12/Salary.txt");
		Scanner output = new Scanner(file);
		int totalAssociates = 0;
		int totalAssistants = 0;
		int totalFull = 0;
		double totalSalaryOfAssistant = 0;
		double totalSalaryOfAssociate = 0;
		double totalSalaryOfFull = 0;
		while (output.hasNext()) {
			
			String[] line = output.nextLine().split(" ");
			if (line[2].equals("assistant")) {
				totalSalaryOfAssistant += Double.parseDouble(line[3]);
				totalAssistants++;
			}
			else if (line[2].equals("associate")) {
				totalSalaryOfAssociate += Double.parseDouble(line[3]);
				totalAssociates++;
			}
			else {
				totalSalaryOfFull += Double.parseDouble(line[3]);
				totalFull++;
			}
		}
		double averageSalaryOfAssistant = totalSalaryOfAssistant / totalAssistants;
		double averageSalaryOfAssociate = totalSalaryOfAssociate / totalAssociates;
		double averageSalaryOfFull = totalSalaryOfFull / totalFull;
		double totalOfFaculty = totalSalaryOfAssistant + totalSalaryOfAssociate + totalSalaryOfFull;
		double averageOfFaculty = totalOfFaculty / (totalAssistants + totalAssociates + totalFull);
		
		System.out.println("Rank                     Total salary      Average salary");
		System.out.printf("Assistant Professor %5s$%9.2f      $%7.2f\n"," ", totalSalaryOfAssistant, averageSalaryOfAssistant);
		System.out.printf("Associate Professor %5s$%9.2f      $%7.2f\n"," ", totalSalaryOfAssociate, averageSalaryOfAssociate);
		System.out.printf("Full Professor %10s$%9.2f      $%7.2f\n"," ", totalSalaryOfFull, averageSalaryOfFull);
		System.out.printf("All Faculty %13s$%9.2f      $%7.2f\n"," ", totalOfFaculty, averageOfFaculty);
		output.close();
	}
}
