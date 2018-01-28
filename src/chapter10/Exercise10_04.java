package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 28, 2018 3:14:02 PM
 */
public class Exercise10_04 {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println(p1.distance(p2));
	}
}
class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
		this(0, 0);
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint p) {
		return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
	}
	
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
