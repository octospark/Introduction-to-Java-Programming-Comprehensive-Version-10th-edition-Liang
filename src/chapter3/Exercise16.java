package chapter3;

public class Exercise16 {
	public static void main(String[] args) {
		// Rectangle centered at (0, 0) with width 100 and height 200
		// We'll print two random numbers within the range [-50, 50]
		// for the x value and [-100, 100] for the y value
		double x = Math.random() * 100 - 50;
		double y = Math.random() * 200 - 100;
		System.out.print("Random coordinate for rectangle centered at (0, 0): (" + x + "," + y + ")");
	}
}
