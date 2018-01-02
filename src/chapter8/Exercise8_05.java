package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 1, 2018 8:02:56 PM
 * (Algebra: add two matrices) Write a method to add two matrices.
 */
public class Exercise8_05 {
	private static Scanner input;
	public static void main(String[] args) {
		System.out.print("Enter matrix1 (3x3): ");
		double[][] a = new double[3][3];
		a = fillValues(a);
		
		System.out.print("Enter matrix2 (3x3): ");
		double[][] b = new double[3][3];
		b = fillValues(b);
		double[][] c = addMatrix(a, b);
		printAddMatrix(a, b, c);
	}
	/** The working assumption in this method is that the matrices are rectangular
	 * and have the equal dimension with one another */
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c[0].length; j++)
				c[i][j] = a[i][j] + b[i][j];
		return c;
	}
	/** return a filled matrix with values from the input prompt*/
	public static double[][] fillValues(double[][] a){
		input = new Scanner(System.in);
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = input.nextDouble();
		
		return a;
	}
	public static void printAddMatrix(double[][] a, double [][] b, double[][] c) {
		int middle = a.length / 2;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			if (i == middle)
				System.out.print(" +  ");
			else
				System.out.print("    ");
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			if (i == middle)
				System.out.print(" =  ");
			else
				System.out.print("    ");
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
