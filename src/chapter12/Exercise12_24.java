package chapter12;
import java.io.PrintWriter;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 5:39:38 PM
 * 
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt.
 */
public class Exercise12_24 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chapter12/Salary.txt");
		PrintWriter output = new PrintWriter(file);
		
		String[] rank = {"assistant", "associate", "full"};
		double salary = 0;
		String rankName = "";
		for (int i = 1; i <= 1000; i++) {
			int rankNumber = (int)(Math.random() * 3);
			
			if (rankNumber == 0) 
				salary = 50000 + Math.random() * 30000;
			else if (rankNumber == 1)
				salary = 60000 + Math.random() * 50000;
			else
				salary = 75000 + Math.random() * 55000;
			
			salary = Math.round(salary * 100) / 100.0;
			rankName = rank[rankNumber];
			
			String line = "FirstName" + i + " LastName" + i + " " + rankName + " " + salary;
			output.println(line);
		}
		output.close();
	}
}
