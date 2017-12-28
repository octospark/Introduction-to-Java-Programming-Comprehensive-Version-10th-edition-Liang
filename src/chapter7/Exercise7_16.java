package chapter7;

/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_16 {
	public static void main(String[] args) {
		/** Create an array of numbers and choose a number as key at random */
		double[] randomNumbers = new double[10000000];
		for (int i = 0; i < randomNumbers.length; i++)
			randomNumbers[i] = Math.random();
		int keyIndex = (int)(Math.random() * randomNumbers.length);
		double key = randomNumbers[keyIndex];
		
		/** Run the searches, binary and linear, and measure the time */
		long startTime = System.nanoTime();
		BinarySearch.binarySearch(randomNumbers, key);
		long endTime = System.nanoTime();
		long executionTime1 = endTime - startTime;
		
		
		startTime = System.nanoTime();
		LinearSearch.linearSearch(randomNumbers, key);
		endTime = System.nanoTime();
		long executionTime2 = endTime - startTime;
		System.out.println("The time for binary search is " + executionTime1 + " ns" + " and for " + 
		" linear search was " + executionTime2 + " ns");
		System.out.println("Binary was " + (executionTime2 / executionTime1) + " times faster");
	}
}
