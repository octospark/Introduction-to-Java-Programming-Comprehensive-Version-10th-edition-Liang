package chapter8;

/**
 * @author Erlin Goce
 *
 * Jan 2, 2018 5:22:01 PM
 */
public class Exercise8_10 {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		matrix = randomBinaryMatrix(matrix.length, matrix[0].length);
		
		
		int maxRows = 0;
		
		int maxRowsIndex = 0;
		
		int maxCols = 0;
		
		int maxColsIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			int sumRows = 0;
			int sumCols = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] != 0)
					sumRows++;
				if (matrix[j][i] != 0)
					sumCols++;
			}
			if (sumRows > maxRows) {
				maxRows = sumRows;
				maxRowsIndex = i;
			}
			if (sumCols > maxCols) {
				maxCols = sumCols;
				maxColsIndex = i;
			}
		}
		printArray(matrix);
		System.out.println("The largest row index: " + maxRowsIndex);
		System.out.println("The largest column index: " + maxColsIndex);
	}
	
	public static int[][] randomBinaryMatrix(int rows, int cols){
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int random = (int)(Math.random() * 2);
				matrix[i][j] = random;
			}
		}
		return matrix;
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
