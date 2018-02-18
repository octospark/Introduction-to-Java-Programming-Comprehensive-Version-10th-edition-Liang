package chapter11;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 12:50:04 PM
 * 
 * (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
 * to replace an array to store students. Draw the new UML diagram for the class.
 * You should not change the original contract of the Course class (i.e., the definition
 * of the constructors and methods should not be changed, but the private
 * members may be changed.)
 */
public class Exercise11_05 {
	public static void main(String[] args) {
		Course course = new Course("Computer Science");
		course.addStudent("john");
		course.addStudent("kathy");
		course.addStudent("william");
		System.out.println(course.getStudents());
		course.dropStudent("john");
		System.out.println(course.getStudents());
	}
}
class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents = students.size();
	}
	
	public ArrayList<String> getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		// Find an remove the given student
		students.remove(student);
	}
	
	public void clear() {
		students.clear();
	}
}

