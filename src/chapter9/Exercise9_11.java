package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 21, 2018 11:33:18 AM
 */
public class Exercise9_11 {
	public static void main(String[] args) {
		LinearEquation linear = new LinearEquation(1, 2, 2, 4, 4, 6);
		if (linear.isSolvable()) {
			System.out.println("The solutions of the linear system of equations is (" +
		linear.getX() + ", " + linear.getY() + ")");
		}
		else
			System.out.println("The system of linear equations has no solutions");
	}
}
class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		double result = this.a * this.d - this.b * this.c;
		if (result != 0)
			return true;
		else
			return false;
	}
	
	public double getX() {
		double x = (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
		return x;
	}
	
	public double getY() {
		double y = (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
		return y;
	}
}
