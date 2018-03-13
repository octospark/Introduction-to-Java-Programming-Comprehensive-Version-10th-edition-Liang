package chapter13;

/**
 * @author Erlin Goce
 *
 * Mar 13, 2018 3:07:18 PM
 */
public class ComparableRectangle extends Rectangle
	implements Comparable<ComparableRectangle> {
	/** COnstruct a ComparableRectangle with the specified properties */
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}
	
	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(ComparableRectangle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea()< o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override // Implement the toString method in geometricObject
	public String toString() {
		return super.toString() + " Area: " + getArea();
	}
}
