package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 23, 2018 7:16:58 PM
 */
public class UseBMIClass {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " +
		bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Susan King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " +
		bmi2.getBMI() + " " + bmi2.getStatus());
	}
}
