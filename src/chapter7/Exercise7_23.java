package chapter7;

/**
 * @author pc
 *
 * Dec 27, 2017
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 * closed on the first day of school. As the students enter, the first student, denoted
 * S1, opens every locker. Then the second student, S2, begins with the second
 * locker, denoted L2, and closes every other locker. Student S3 begins with the
 * third locker and changes every third locker (closes it if it was open, and opens it if
 * it was closed). Student S4 begins with locker L4 and changes every fourth locker.
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student
 * S100 changes L100.
 * After all the students have passed through the building and changed the lockers,
 * which lockers are open? Write a program to find your answer and display all
 * open locker numbers separated by exactly one space.
 */
public class Exercise7_23 {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[101];
		//Arrays.fill(lockers, true); // initially the lockers are all closed
		for (int i = 0; i < lockers.length; i++) {
			changeStateEveryNthDoor(lockers, i);
		}
		Exercise7_15.printArray(lockers);
		
		
	}
	/** change the state of every n-th door */
	public static void changeStateEveryNthDoor(boolean[] array, int n) {
		for (int i = 0; i < array.length; i += n + 1) {
			if (array[i] == true)
				array[i] = false;
			else
				array[i] = true;
		}
	}
}
