package chapter8;

import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 12:06:04 PM
 * (Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking
 * whether every number is valid in the board. Rewrite the program by checking
 * whether every row, every column, and every small box has the numbers 1 to 9.
 */
public class Exercise8_24 {
	public static void main(String[] args) {
		int[][] grid = readASolution();
		System.out.println(isValid(grid) ? "Valid solution" : "Invalid Solution");
		
		
	}
	
	/** Read a sudoku solution from the console */
	public static int[][] readASolution(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sudoku puzzle solution: ");
		int grid[][] = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();
		input.close();
		return grid;
	}
	public static boolean isValid(int[][] sudoku) {
		int[] allNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//1. Check rows and columns
		int countValidRows = 0;
		int countValidColumns = 0;
		for (int k: allNumbers) {
			for (int i = 0; i < sudoku.length; i++) {
				for (int j = 0; j < sudoku[i].length; j++) {
					if (k == sudoku[i][j])
						countValidRows++;
					if (k == sudoku[j][i])
						countValidColumns++;
				}
			}
		}
		if (!(countValidRows == 81))
			return false;
		if (!(countValidColumns == 81))
			return false;
		//2. Check small three-by-three boxes
		//TODO
		
		int countValidBlocks = 0;
		for (int k: allNumbers) {
			for (int i = 0; i < 9; i+=3) {
				for (int j = 0; j < 9; j+=3) {
					int[][] block = findBlock(sudoku, i, j, 3);
					if (inArray(k, block))
						countValidBlocks++;
				}	
			}
		}
		if (!(countValidBlocks == 81))
			return false;
		return true;
	}
	/** Return the block with the given size from the position i, j*/
	public static int[][] findBlock(int[][] array, int i, int j, int size) {
		int[][] block = new int[size][size];
		for (int k = i, n = 0; k < i + size; k++, n++) {
			for (int m = j, p = 0; m < j + size; m++, p++) {
				block[n][p] = array[k][m];
			}
		}
		return block;
	}
	public static boolean inArray(int number, int[][] m) {
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				if (m[i][j] == number)
					return true;
		return false;
	}
}
