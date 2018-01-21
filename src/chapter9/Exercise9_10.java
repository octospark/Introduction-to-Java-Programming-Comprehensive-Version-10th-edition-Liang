package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 21, 2018 11:16:39 AM
 */
public class Exercise9_10 {
	public static void main(String[] args) {
		QuadraticEquation eq1 = new QuadraticEquation(2, 4, 2);
		if (eq1.getRoot1() == eq1.getRoot2() && eq1.getRoot1() == 0)
			System.out.println("The equation has no roots");
		else if (eq1.getRoot1() == eq1.getRoot2())
			System.out.println("The root of the equation is " + eq1.getRoot1());
		else {
			System.out.println("The roots of the equation are " + 
					eq1.getRoot1() + " and " + eq1.getRoot2());
			}
	}
}
class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return this.b * this.b - 4 * this.a * this.c;
	}
	
	public double getRoot1() {
		double discriminant = this.getDiscriminant();
		if (discriminant < 0)
			return 0;
		else {
			double r = (- this.b + Math.sqrt(discriminant)) / (2 * this.a);
			return r;
		}
	}
	public double getRoot2() {
		double discriminant = this.getDiscriminant();
		if (discriminant < 0)
			return 0;
		else {
			double r = (- this.b - Math.sqrt(discriminant)) / (2 * this.a);
			return r;
		}
	}
}
