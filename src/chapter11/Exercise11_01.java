package chapter11;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Feb 14, 2018 7:06:17 PM
 */
public class Exercise11_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if ((side1 + side2 < side3 || side2 + side3 < side1) || side1 + side3 < side2) {
			System.out.println("The sides do not form a triangle. Exiting...");
			System.exit(1);
			}
		System.out.print("Enter the color of the triangle and a boolean value for the filled attribute:");
		String color = input.next();
		
		String filled = input.next();
		System.out.println(filled);
		boolean filledBooleanValue;
		if (filled.equals("true"))
			filledBooleanValue = true;
		else
			filledBooleanValue = false;
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filledBooleanValue);
		
		System.out.println(t.toString());
		System.out.println("The area is: " + t.getArea());
		System.out.println("The perimeter is: " + t.getPerimeter());
		System.out.println("The color is: " + t.getColor());
		System.out.println("The triangle is filled? " + t.isFilled());
		input.close();
	}
}
class Triangle extends SimpleGeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		this(0, 0, 0);
	}
	
	public Triangle(double side1, double side2, double side3) {
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
