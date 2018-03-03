package chapter12;
import chapter11.Exercise11_01;
import chapter11.SimpleGeometricObject;
/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 7:28:54 PM
 */
public class Exercise12_05 {
	public static void main(String[] args) {
		try {
			Triangle t = new Triangle(1, 2, 3);
			t.isFilled();
		}
		 catch(IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
class Triangle extends SimpleGeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() throws IllegalTriangleException {
		this(0, 0, 0);
	}
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if ((side1 + side2 == side3 || side1 + side3 == side2) || side2 + side3 == side1)
			throw new IllegalTriangleException(side1, side2, side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
@SuppressWarnings("serial")
class IllegalTriangleException extends Exception{
	private double side1;
	private double side2;
	private double side3;
	
	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Invalid values for sides:" + side1 + ", " + side2 + ", " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
}
