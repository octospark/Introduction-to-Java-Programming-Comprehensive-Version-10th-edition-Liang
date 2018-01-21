package chapter9;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 21, 2018 12:04:12 PM
 */
public class Exercise9_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] array = new double[row][column];
		System.out.println("Enter the array: ");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				array[i][j] = input.nextDouble();
		Location loc = Location.locateLargest(array);
		System.out.println("The largest element is " + loc.maxValue + 
				" at (" + loc.row + ", " + loc.column + ")");
		input.close();
	}
}

class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public static Location locateLargest(double[][] a) {
		Location loc = new Location();
		loc.row = 0;
		loc.column = 0;
		loc.maxValue = a[loc.row][loc.column];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > loc.maxValue) {
					loc.maxValue = a[i][j];
					loc.row = i;
					loc.column = j;
				}
			}
		}
		return loc;
	}
}
