package chapter7;
import java.util.Scanner;
public class Exercise7_05{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		int digit = input.nextInt();
		int count = 0;
		for (int i = 0; i < numbers.length - 1; i++){
			if (!isInArray(digit, numbers)){
				numbers[count] = digit;
				count++;
			}
			digit = input.nextInt();
		}
		printArray(numbers);
		input.close();
	}
	public static boolean isInArray(int number, int[] list){
		for (int i = 0; i < list.length; i++){
			if (number == list[i])
				return true;
		}
		return false;
	}
	public static void printArray(int[] list){
		for (int i = 0; i < list.length; i++){
			if (list[i] != 0)
				System.out.print(list[i] + " ");
		}
	}
}