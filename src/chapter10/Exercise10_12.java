package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 29, 2018 3:51:55 PM
 */
public class Exercise10_12 {
	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(-4, 3), new MyPoint(-2, 0),
				new MyPoint(3, 5));
		Triangle2D t2 = new Triangle2D(new MyPoint(-1, 0), new MyPoint(2, 4),
				new MyPoint(2, 0));
		System.out.println(t1.contains(new MyPoint(3, 5)));
		System.out.println(t1.getArea());
		System.out.println(t1.overlaps(t2));
		
	}
}
class Triangle2D{
	// MyPoint class is defined in Programming Exercise 10_04
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D() {
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double getArea() {
		double side1 = this.p1.distance(this.p2);
		double side2 = this.p1.distance(this.p3);
		double side3 = this.p2.distance(this.p3);
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter() {
		double side1 = this.p1.distance(this.p2);
		double side2 = this.p1.distance(this.p3);
		double side3 = this.p2.distance(this.p3);
		return side1 + side2 + side3;
	}
	
	/** If the area formed by the four points is greater than the area of the triangle
	 * the point is outside the triangle*/
	public boolean contains(MyPoint p) {
		double area1 = getArea(this.p1, this.p2, p);
		double area2 = getArea(this.p1, this.p3, p);
		double area3 = getArea(this.p2, this.p3, p);
		return (area1 + area2 + area3) - getArea() < 0.00000000001;
	}
	/** Helper method for the contains method above. Returns
	 * the area of a triangle given three points. */
	public static double getArea(MyPoint p1, MyPoint p2, MyPoint p3) {
		double side1 = p1.distance(p2);
		double side2 = p1.distance(p3);
		double side3 = p2.distance(p3);
		
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public boolean contains(Triangle2D t) {
		return (this.contains(t.getP1()) && this.contains(t.getP2())) && this.contains(t.getP3());
	}
	
	public boolean overlaps(Triangle2D t) {
		boolean doesOverlap = false;
		// Testing for intersection for the first side of first triangle with
		// three sides of the second triangle
		if (intersects(this.p1, this.p2, t.p1, t.p2) || intersects(this.p1, this.p2, t.p1, t.p3) ||
				intersects(this.p1, this.p2, t.p2, t.p3)) {
			doesOverlap = true;
			System.out.println("first");
			}
		
		// Second segment of first triangle with the second triangle
		if (intersects(this.p1, this.p3, t.p1, t.p2) || intersects(this.p1, this.p3, t.p1, t.p3) ||
				intersects(this.p1, this.p3, t.p2, t.p3)) {
			doesOverlap = true;
			System.out.println("second");
			}
		
		// Third segment of the first triangle with the second triangle
		if (intersects(this.p2, this.p3, t.p1, t.p2) || intersects(this.p2, this.p3, t.p1, t.p3) ||
				intersects(this.p2, this.p3, t.p2, t.p3)) {
			doesOverlap = true;
			System.out.println("third");
			}
		return doesOverlap;
	}
	
	/** Helper method for the overlaps method defined above. Returns true if the
	 * segments formed from points (p1, p2) intersects with segment formed
	 * from points (p3, p4)*/
	public static boolean intersects(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
		boolean first = false;
		boolean second = false;
		// Slope of segment from p1 to p2
		double slope1 = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
		
		if ((overTheLine(p1.getX(), p1.getY(), slope1, p3.getX(), p3.getY()) &&
			!overTheLine(p1.getX(), p1.getY(), slope1, p4.getX(), p4.getY())) ||
			(!overTheLine(p1.getX(), p1.getY(), slope1, p3.getX(), p3.getY()) &&
			overTheLine(p1.getX(), p1.getY(), slope1, p4.getX(), p4.getY())))
			first = true;
		
		// Slope of segment from p3 to p4
		double slope2 = (p3.getY() - p4.getY()) / (p3.getX() - p4.getX());
		
		if ((overTheLine(p3.getX(), p3.getY(), slope2, p1.getX(), p1.getY()) &&
			!overTheLine(p3.getX(), p3.getY(), slope2, p2.getX(), p2.getY())) ||
			(!overTheLine(p3.getX(), p3.getY(), slope2, p1.getX(), p1.getY()) &&
			  overTheLine(p3.getX(), p3.getY(), slope2, p2.getX(), p2.getY())))
			second = true;
		// Return true if both conditions apply
		return first && second;
	}
	
	/** Helper method to determine if the y coordinate of a point is greater than the line */
	public static boolean overTheLine(double x1, double y1, double slope,
			double xPoint, double yPoint) {
		// Point-slope equation of a line
		double xLine = xPoint;
		double yLine = slope * (xLine - x1) + y1;
		return yLine <= yPoint;
	}
	
	public MyPoint getP1() {
		return p1;
	}
	
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	
	public MyPoint getP2() {
		return p2;
	}
	
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	
	public MyPoint getP3() {
		return p3;
	}
	
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
}
