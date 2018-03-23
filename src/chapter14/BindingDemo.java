package chapter14;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * @author Erlin Goce
 *
 * Mar 21, 2018 12:09:52 PM
 */
public class BindingDemo {
	public static void main(String[] args) {
		DoubleProperty d1 = new SimpleDoubleProperty(1);
		DoubleProperty d2 = new SimpleDoubleProperty(2);
		d1.bindBidirectional(d2);
		System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
		d2.setValue(70.2);
		System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
		d1.setValue(40.3);
		System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
	}
}
