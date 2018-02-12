package chapter11;

/**
 * @author Erlin Goce
 *
 * Feb 10, 2018 2:50:45 PM
 */
public class DynamicBindingDemo {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}
class GraduateStudent extends Student{
	
}

class Student extends Person{
	@Override
	public String toString() {
		return "Student";
	}
}
class Person extends Object{
	@Override
	public String toString() {
		return "Person";
	}
}