package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 27, 2017
 * Bubble sort ftw :)
 */
public class Exercise7_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
		bubbleSort(array);
		Exercise7_15.printArray(array);
		input.close();
	}
	/** Sort an array in increasing order. Bubblesort algorithm */
	public static void bubbleSort(int[] array) {
		int swap = 1;
		while (swap != 0) {
			swap = 0;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap++;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			if (swap == 0)
				break;
		}
	}
}
