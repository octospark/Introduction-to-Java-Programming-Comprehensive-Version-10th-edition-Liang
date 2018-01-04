package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 3, 2018 2:16:04 PM
 * (Financial tsunami) Banks lend money to each other. In tough economic times,
 * if a bank goes bankrupt, it may not be able to pay back the loan. A bank’s
 * total assets are its current balance plus its loans to other banks. The diagram in
 * Figure 8.8 shows five banks. The banks’ current balances are 25, 125, 175, 75,
 * and 181 million dollars, respectively. The directed edge from node 1 to node 2
 * indicates that bank 1 lends 40 million dollars to bank 2.
 * If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
 * borrowed cannot be returned to the lender, and the lender cannot count the loan in
 * its total assets. Consequently, the lender may also be unsafe, if its total assets are
 * under the limit. Write a program to find all the unsafe banks. Your program reads
 * the input as follows. It first reads two integers n and limit, where n indicates the
 * number of banks and limit is the minimum total assets for keeping a bank safe. It
 * then reads n lines that describe the information for n banks with IDs from 0 to n-1.
 * The first number in the line is the bank’s balance, the second number indicates
 * the number of banks that borrowed money from the bank, and the rest are pairs
 * of two numbers. Each pair describes a borrower. The first number in the pair
 * is the borrower’s ID and the second is the amount borrowed. For example, the 
 * input for the five banks in Figure 8.8 is as follows (note that the limit is 201):
 */
public class Exercise8_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of banks and the minimum safety amount: ");
		int size = input.nextInt();
		double limit = input.nextDouble();
		double[] assets = new double[size];// assets
		double[][] moves = new double[size][];// loans to other banks
		for (int i = 0; i < size; i++) {
			assets[i] = input.nextDouble();
			int length = input.nextInt();
			double[] temp = new double[length * 2];
			
			for (int j = 0; j < length * 2; j++) {
				temp[j] = input.nextDouble();
			}
			moves[i] = temp;
		}
		
		
		int riskedNow = 1; // used in the while loop below is a bank is risked
		int riskedTotal = 0;
		int[] riskedBanks = new int[size];
		fillWithMinusOne(riskedBanks);//This array will hold the risked banks' indexes
									  // this is why the default value is -1, to assume 
		                              // all banks are initially non risked
		
		
		while (riskedNow > 0) {
			riskedNow = 0;
			int riskedBankIndex = 0;
			// Determine the index of the bank at risk
			for (int i = 0; i < assets.length; i++) {
				double loanAmount = 0;
				for (int j = 1; j < moves[i].length; j+=2) {
					loanAmount += moves[i][j];
				}
				if ( assets[i] != -1 && loanAmount + assets[i] < limit) {
					riskedNow++;
					riskedBankIndex = i;
					riskedBanks[riskedTotal] = riskedBankIndex;
					riskedTotal++;
				}
			}
			//1. Turn the assets of the risked bank -1 so as not to pass
			// over it again the next iteration
			
			for (int i = 0; i < assets.length; i++) {
				if (i == riskedBankIndex)
					assets[i] = -1;
			}
			
			//2. make 0 the amount of loans that the risked bank had
			// taken from other banks
			for (int i = 0; i < moves.length; i++) {
				for (int j = 0; j < moves[i].length; j+=2) {
					if (moves[i][j] == riskedBankIndex)
						moves[i][j + 1] = 0;
				}
			}
		}
		System.out.print("Unsafe banks are ");
		printPositives(riskedBanks);
		input.close();
	}
	public static void printArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void fillWithMinusOne(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = -1;
	}
	public static void printPositives(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] >= 0)
				System.out.print(arr[i] + " ");
	}
}
