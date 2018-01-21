package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 21, 2018 11:01:22 AM
 */
public class Exercise9_9 {
	public static void main(String[] args) {
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(6, 4);
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The polygon 1 area is " + poly1.getArea());
		System.out.println("The polygon 1 perimeter is " + poly1.getPerimeter());
		System.out.println("The polygon 2 area is " + poly2.getArea());
		System.out.println("The polygon 2 perimeter is " + poly2.getPerimeter());
		System.out.println("The polygon 3 area is " + poly3.getArea());
		System.out.println("The polygon 3 perimeter is " + poly3.getPerimeter());
	}
}
class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon() {
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, int side) {
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, int side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return this.n * this.side;
	}
	
	public double getArea() {
		return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
	}
}
