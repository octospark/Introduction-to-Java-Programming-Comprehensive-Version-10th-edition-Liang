package chapter9;

import chapter7.SelectionSort;

/**
 * @author Erlin Goce
 *
 * Jan 20, 2018 5:15:53 PM
 */
public class Exercise9_6 {
	public static void main(String[] args) {
		int size = 100000;
		double[] array = new double[size];
		for (int i = 0; i < size; i++) {
			array[i] = Math.random();
		}
		StopWatch clock = new StopWatch();
		//clock.start();
		SelectionSort.selectionSort(array);// determined in chapter 7
		clock.stop();
		System.out.println("The array was sorted in " + clock.getElapsedTime() + " milliseconds");
		
	}
}
class StopWatch{
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
