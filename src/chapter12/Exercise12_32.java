package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 10, 2018 4:53:10 PM
 * 
 * (Ranking summary) Write a program that uses the files described in Programming
 * Exercise 12.31 and displays a ranking summary table for the first five
 * girl’s and boy’s names. The available data is for the years 2000 to 2016.
 */
public class Exercise12_32 {
	private static Scanner output;

	public static void main(String[] args) throws Exception {
		String[] fiveFirstFromBoth = new String[10];
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Year       Rank1       Rank2       Rank3        Rank4       Rank5      Rank1      Rank2      Rank3      Rank4       Rank5");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		for (int i = 2000; i <= 2016; i++) {
			File file = new File("src/chapter12/yob" + i + ".txt");
			output = new Scanner(file);
			
			int countGirls = 0;
			int countBoys = 0;
			int countTotal = 0;
			while (output.hasNext()) {
				String line = output.nextLine();
				String[] lineList = line.split(",");
				if (lineList[1].equals("F") && countGirls < 5) {
					countGirls++;
					fiveFirstFromBoth[countTotal] = lineList[0];
					countTotal++;
				}
				if (lineList[1].equals("M") && countBoys < 5) {
					countBoys++;
					fiveFirstFromBoth[countTotal] = lineList[0];
					countTotal++;
				}
			}
			System.out.print(i);
			for (int j = 0; j < fiveFirstFromBoth.length; j++)
				System.out.printf("%12s",fiveFirstFromBoth[j]);
			System.out.println();
		}
	}
}
