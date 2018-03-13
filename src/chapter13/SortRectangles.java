package chapter13;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Mar 13, 2018 3:12:52 PM
 */
public class SortRectangles {
	public static void main(String[] args) {
		ComparableRectangle[] rectangles = {
				new ComparableRectangle(3.4, 5.4),
				new ComparableRectangle(13.24, 55.4),
				new ComparableRectangle(7.4, 35.4),
				new ComparableRectangle(1.4, 25.4)
		};
		Arrays.sort(rectangles);
		
		for (Rectangle rectangle: rectangles) {
			System.out.print(rectangle + " ");
			System.out.println();
		}
	}
}
