package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 29, 2017
 * 
 * (Partition of a list) Write a method that partitions the list using the
 * first element, called a pivot.
 * After the partition, the elements in the list are rearranged so that all the elements
 * before the pivot are less than or equal to the pivot and the elements after the pivot
 * are greater than the pivot. The method returns the index where the pivot is located
 * in the new list.
 */

public class Exercise7_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the list: ");
		int size = input.nextInt();
		int[] list = new int[size];
		System.out.print("Enter the list whose first element is the pivot: ");
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		System.out.println("The index of the pivot is " + partition(list));
		System.out.print("And the list after the partition is ");
		printArray(list);
		
		input.close();
	}
	public static int partition(int[] list) {
		int pivotIndex = 0;
		int pivot = list[pivotIndex];
		int listIndex = 1;
		while (listIndex < list.length) {
			int listIndexTemp = listIndex;
			if (pivot > list[listIndex]) {
				// If a smaller element than pivot is encountered,
				// backswap until reaching the pivot
				while(listIndex > pivotIndex) {
					int temp = list[listIndex];
					list[listIndex] = list[listIndex - 1];
					list[listIndex - 1] = temp;
					listIndex--;
				}
				pivotIndex++;
				pivot = list[pivotIndex];
				listIndex = listIndexTemp;
			}
			listIndex++;
		}
		return pivotIndex;
	}
	public static void printArray(int[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] +" ");
	}
}
