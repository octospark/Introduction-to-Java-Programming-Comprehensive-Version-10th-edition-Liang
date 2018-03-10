package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 10, 2018 3:23:02 PM
 * (The program is slightly changed from the from the book version to accommodate
 * the structure of the data files.)
 * (Baby name popularity ranking) The popularity ranking of baby names from
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named yob2000.txt, yob2001.txt, . . . , yob2016.txt. Each file 
 * contains two thousand lines. Each line contains a name, a gender, and the number
 * for the child's name. First is the list of female children and then of the male
 * ones, and the position in their respective lists represents the ranking.
 * Write a program that prompts the user to enter the year, gender, and followed
 * by a name, and displays the ranking of the name for the year.
 */
public class Exercise12_31 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		String year = input.next();
		String fileName = "src/chapter12/yob" +  year + ".txt";
		
		System.out.print("Enter gender: ");
		String gender = input.next();
		
		System.out.print("Enter the name: ");
		String name = input.next();
		
		
		File file = new File(fileName);
		Scanner output = new Scanner(file);
		int rank = 0;
		while(output.hasNext()) {
			String line = output.nextLine();
			String[] lineList = line.split(",");
			
			if (gender.equals(lineList[1])) {
				rank++;
				}
			if (lineList[0].equals(name) && gender.equals(lineList[1])) {
				break;
			}
			
		}
		
		System.out.println(name + " is ranked #" + rank + " in the year " + year);
		input.close();
		output.close();
		
	}
}

/** P.S It took me some time to notice that my initial solution was not working all the time
 *  due to the fact that a given name can belong to both genders and the break condition of
 *  the while loop should check for both name and gender conditions. */