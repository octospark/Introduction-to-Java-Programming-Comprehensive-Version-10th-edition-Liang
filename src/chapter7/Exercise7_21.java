package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 27, 2017
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton
box, is a device for statistics experiments named after English scientist Sir
Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
in a triangular form
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it
has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
in the slots at the bottom of the board.
Write a program that simulates the bean machine. Your program should prompt
the user to enter the number of the balls and the number of the slots in the machine.
Simulate the falling of each ball by printing its path.
 * 
 * 
 */
public class Exercise7_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots: ");
		int slots = input.nextInt();
		
		// The size of the array will be the number "slots" we just got
		int[] array = new int[slots];
		for (int i = 0; i < numberOfBalls; i++) {
			String fallingPath = path(slots - 1);
			System.out.println(fallingPath);
			int index = finalPositionOfBall(fallingPath);
			array[index]++;
		}
		printBeanSimulation(array);
		input.close();
		
	}
	/** Return a string representing a random path of left and right movements */
	public static String path(int n) {
		// n is the number of slots minus 1
		// Given that the pins stand always between the slots, there will
		// always be one less pin per slot.
		String path = "";
		for (int i = 0; i < n; i++) {
			int digit = (int)(Math.random() * 2);
			if (digit == 0)
				path += 'L';
			else
				path += 'R';
		}
		return path;
	}
	/** Return the final position of a ball in the slots array.
	 *  The index will be used in another array representing the slots. */
	public static int finalPositionOfBall(String path) {
		// we start at the middle of the array
		double position = (path.length() * 1.0) / 2;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'L')
				position-= 0.5;
			else
				position+= 0.5;
		}
		return (int)position;
	}
	/** The heart of the simulation. We find the max of the array and start printing from 
	 * there. Every time we find elements equal to max we print a bean and remove it from 
	 * the array representing the slots.*/
	public static void printBeanSimulation(int[] array) {
		System.out.println("\n\n");
		
		while (!allZero(array)) {
			int max = max(array);
			for (int i = 0; i < array.length; i++) {
				if (array[i] == max) {
					System.out.print("|0");
					array[i]--;
					}
				else
					System.out.print("| ");
			}
			System.out.println("|");
		}
		
	}
	/** An auxiliary method for the printBeamSimulation
	 * It determines if all elements of an array are zero, case that ends
	 * the printing of the histograms for the simulation
	 *  */
	public static boolean allZero(int[] array) {
		for (int i = 0; i < array.length; i++)
			if (array[i] != 0)
				return false;
		return true;
	}
	
	/** In a previous attempt of printing the simulation, the histograms was upside down.
	 * I realized that an inverse transformation would require finding the max of the array
	 * and starting from there to print the beans. So the next method finds the max of an 
	 * array :) */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}
}
