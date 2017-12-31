package chapter7;

/**
 * @author Erlin Goce
 *
 * Dec 27, 2017
 * (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
on a chessboard such that no two queens can attack each other (i.e., no two queens
are on the same row, same column, or same diagonal). There are many possible
solutions. Write a program that displays one such solution.

****I took the liberty to find all solutions, even though this took a long time
*and plenty of head aches. All the combinations are there, 3709440 in total.
But taking into account that queens are the same, they are not distinct,the above 
number should be divided by 8!, giving 92. On further reading on the matter, I found out
 that the number of combinations is really 12 and comes by removing the solutions that contain
 transformations.****
 */
public class Exercise7_22 {
	public static void main(String[] args) {
		// Create and initialize the chess table
		int[] table = new int[64];
		for (int i = 0; i < table.length; i++)
			table[i] = i;
		
		
		
		int count = 0;
		for (int a: table) {
			int[] secondQueen = extendInfluence(table, a);
			for (int b: secondQueen) {
				int[] thirdQueen = extendInfluence(secondQueen, b);
				
				for (int c: thirdQueen) {
					int[] fourthQueen = extendInfluence(thirdQueen, c);
					
					for (int d: fourthQueen) {
						int[] fifthQueen = extendInfluence(fourthQueen, d);
						
						for (int e: fifthQueen) {
							int[] sixthQueen = extendInfluence(fifthQueen, e);
							
							for (int f: sixthQueen) {
								int[] seventhQueen = extendInfluence(sixthQueen, f);
								
								for (int g: seventhQueen) {
									int[] eightthQueen = extendInfluence(seventhQueen, g);
									for (int h: eightthQueen) {
										
										count++;
										if (count % 1000000 == 0) {
											printChessTable(new int[] {a, b, c, d, e, f, g, h});
											System.out.println("-----------------");
										}
									}
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println(count);
	}

	/** Cover all the rows, colums and diagonals that need to be covered
	 * after a queen is put in a certain position. Return the array of free cells */
	public static int[] extendInfluence(int[] table, int queenPosition) {
		//1. Determine row and column of index and mark the covered cells from the queen
		
		int row = (queenPosition / 8);
		int column = (queenPosition % 8);
		int[] newTable = new int[table.length];
		for (int i = 0; i < table.length; i++) {
			if ((table[i] / 8) == row) {
				int value = linearSearch(table, table[i]);
				newTable[value] = -1;
				
			}
			if (table[i] % 8 == column){
				int value = linearSearch(table, table[i]);
				newTable[value] = -1;
			}
		}
		//2. Determine diagonals and mark the cells covered from the queen
		// a)up left diagonal
		int rowDiag = row;
		int columnDiag = column;
		while ((rowDiag >= 0 && rowDiag <= 7) &&(columnDiag >= 0 && columnDiag <= 7)) {
			rowDiag--;
			if (rowDiag < 0)
				break;
			columnDiag--;
			if(columnDiag < 0)
				break;
			int index = (rowDiag * 8 + columnDiag);
			if (inArray(index, table)) {
				int value = linearSearch(table, index);
				newTable[value] = -1;
				}
			
		}
		
		//b) down right diagonal
		rowDiag = row;
		columnDiag = column;
		while ((rowDiag >= 0 && rowDiag <= 7) &&(columnDiag >= 0 && columnDiag <= 7)) {
			rowDiag++;
			if (rowDiag > 7)
				break;
			columnDiag++;
			if (columnDiag > 7)
				break;
			
			int index = (rowDiag * 8 + columnDiag);
			if (inArray(index, table)) {
				int value = linearSearch(table, index);
				newTable[value] = -1;
			}
			
		}
		//c) down left diagonal
		rowDiag = row;
		columnDiag = column;
		while ((rowDiag >= 0 && rowDiag <= 7) &&(columnDiag >= 0 && columnDiag <= 7)) {
			rowDiag++;
			if (rowDiag > 7)
				break;
			columnDiag--;
			if (columnDiag < 0)
				break;
			
			int index = (rowDiag * 8 + columnDiag);
			if (inArray(index, table)) {
				int value = linearSearch(table, index);
				newTable[value] = -1;
			}
		}
		//d)up right diagonal
		rowDiag = row;
		columnDiag = column;
		while ((rowDiag >= 0 && rowDiag <= 7) &&(columnDiag >= 0 && columnDiag <= 7)) {
			rowDiag--;
			if (rowDiag < 0)
				break;
			columnDiag++;
			if (columnDiag > 7)
				break;
			
			int index = (rowDiag * 8 + columnDiag);
			if (inArray(index, table)) {
				int value = linearSearch(table, index);
				newTable[value] = -1;
			}
		}
		
		int[] array = new int[numOfPositives(newTable)];
		int countPositives = 0;
		for (int i = 0; i < newTable.length; i++) {
			if (newTable[i] != -1) {
				array[countPositives] = table[i];
				countPositives++;
			}
		}
		
		return array;
	}
	public static int numOfPositives(int[] array) {
		int count = 0;
		for (int i: array)
			if (i >=0)
				count++;
		return count;
	}
	
	/** Prints the chess board with the queens */
	public static void printChessTable(int[] queens) {
		boolean[] table = new boolean[64];
		for (int i = 0; i < queens.length; i++)
			table[queens[i]] = true;
		
		for (int i = 0; i < table.length; i++) {
			if (table[i] == true)
				System.out.print("|Q");
			else
				System.out.print("| ");
			if ((i + 1) % 8 == 0)
				System.out.println("|");
		}
	}
	
	public static boolean inArray(int element, int[] array) {
		for (int k: array)
			if (element == k)
				return true;
		return false;
	}
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
			}
		return -1;
	}
}
// p.s sorry for the hadouken code
