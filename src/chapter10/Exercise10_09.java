package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 29, 2018 1:18:50 PM
 */
public class Exercise10_09 {
	public static void main(String[] args) {
		Course course = new Course("Artificial Intelligence");
		course.addStudent("Ronald Dicey");
		course.addStudent("Sarah Parker");
		course.addStudent("Ron Dimler");
		course.dropStudent("Sarah Parker");
		System.out.println(course.getStudents()[0]);
		System.out.println(course.getStudents()[1]);// The drop method has worked
		System.out.println(course.getStudents()[2]);// The drop method has worked
	}
}
