package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 29, 2017
 */
public class Exercise7_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt();
		
		System.out.print("Enter list2: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();
		
		int[] merged = merge(list1, list2);
		
		for (int i = 0; i < merged.length; i++)
			System.out.print(merged[i] + " ");
		input.close();
	}
	
	/**A method that merges two sorted list that are in increasing order */
	public static int[] merge(int[] list1, int[] list2) {
		// the merged list will have the length of both lists
		int[] mergedList = new int[list1.length + list2.length];
		int index1 = 0;
		int index2 = 0;
		int mergedIndex = 0;
		//1. Fill the merged list till we get at the end of one of the lists
		while ((index1 < list1.length && index2 < list2.length)) {
			int min = Math.min(list1[index1], list2[index2]);
			if (min == list1[index1]) {
				index1++;
			}
			else {
				index2++;
			}
			
			mergedList[mergedIndex] = min;
			mergedIndex++;
		}
		
		//2. At this point, we can get the remaining elements from the list we did not complete our tour of
		if (index1 == list1.length) {
			while(mergedIndex < mergedList.length) {
				mergedList[mergedIndex] = list2[index2];
				mergedIndex++;
				index2++;
			}
		}
		else {
			while(mergedIndex < mergedList.length) {
				mergedList[mergedIndex] = list1[index1];
				mergedIndex++;
				index1++;
			}
		}
		
		return mergedList;
	}
}
