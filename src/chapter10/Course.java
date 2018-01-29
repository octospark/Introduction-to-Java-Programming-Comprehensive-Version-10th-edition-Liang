package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 26, 2018 10:30:05 AM
 */
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		if (numberOfStudents >= students.length) {
			String temp[] = new String[students.length * 2];
			System.arraycopy(student, 0, temp, 0, numberOfStudents);
			students = temp;
		}
	}
	
	public String[] getStudents() {
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
		int position = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				students[i] = null;
				position = i;
				break;
			}
		}
		// Move to the left all the other students in array to fill empty spot
		for (int i = position; i < students.length - 1; i++) {
			students[i] = students[i + 1];
		}
	}
	
	public void clear() {
		for (int i = 0; i < students.length; i++)
			students[i] = null;
	}
}
