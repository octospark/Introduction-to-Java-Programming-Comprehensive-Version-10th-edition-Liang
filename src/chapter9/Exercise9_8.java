package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 21, 2018 10:19:16 AM
 */
public class Exercise9_8 {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setOn(true);
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		
		Fan fan2 = new Fan();
		fan2.setOn(false); //this is redundant, left here for uniformity
		fan2.setSpeed(2);
		fan2.setRadius(5);// same as the first comment
		fan2.setColor("blue");// same as all above comments
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}
}
class Fan {
	final private int SLOW = 1;
	final private int MEDIUM = 2;
	final private int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		
		if (speed == 1)
			this.speed = SLOW;
		else if (speed == 2)
			this.speed = MEDIUM;
		else if (speed == 3)
			this.speed = FAST;
		else
			System.out.println("Invalid value for speed setting");
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String s = "";
		if (this.on) {
			
			s += "\nFan speed is " + this.getSpeed();
			s += "\nFan color is " + this.getColor();
			s += "\nFan radius is " + this.getRadius();
		}
		else {
			s += "\nFan color is " + this.getColor();
			s += "\nFan radius is " + this.getRadius();
			s += "\nFan is off";
		}
		return s;
	}
}
