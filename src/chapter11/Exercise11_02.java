package chapter11;
import java.util.GregorianCalendar;


/**
 * @author Erlin Goce
 *
 * Feb 14, 2018 7:43:11 PM
 */
public class Exercise11_02 {
	public static void main(String[] args) {
		
		Person2 person = new Person2("john connor", "10 street broadway", 45457 ,
				"jc@gmail.com");
		Student2 student = new Student2("ken johnon", "1 street california", 1475179,
				"kj@gmail.com", "freshman");
		Employee employee = new Employee("peter jackson", "district 9", 46706714,
				"peterj@mail.com", "computer science", 35000);
		Faculty faculty = new Faculty("jack black", "address unkown", 47157998, "jackb@gmail.com",
				"computer science",95000, "whenever I want", "Director");
		Staff staff = new Staff("dan walker", "6 avenue new york", 6471237104l, "danw@mail.com",
				"computer science", 35000, "janitor");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		
	}
}

class Staff extends Employee{
	private String title;
	
	public Staff(String name, String address, long phoneNumber, String email, 
			String office, double salary, String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}
	@Override
	public String toString() {
		return "class name is Staff, person name is " + this.getName();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}

class Faculty extends Employee{
	
	private String officeHours;
	private String rank;
	
	
	public Faculty(String name, String address, long phoneNumber, String email, 
			String office, double salary, String officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "class name is Faculty, person name is " + this.getName();
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
}

class Employee extends Person2{
	private String office;
	private double salary;
	private MyDate dateHired;
	
	public Employee(String name, String address, long phoneNumber, String email, 
			String office, double salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
	public String getHiredDate() {
		return dateHired.toString();
	}
	
	
	@Override
	public String toString() {
		return "class name is Employee, person name is " + this.getName();
	}
	public String getOffice() {
		return office;
	}
	public double getSalary() {
		return salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	
	
}

class Student2 extends Person2{
	private String status;
	
	public Student2(String name, String address, long phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "class name is Student2, person name is " + this.getName();
	}

	public String getStatus() {
		return status;
	}
	
}

class Person2{
	private String name;
	private String address;
	private long phoneNumber;
	private String email;
	
	public Person2(String name, String address, long phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "class name is Person2, person name is " + this.getName();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		GregorianCalendar date = new GregorianCalendar();
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public MyDate(long elapsedTime) {
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(long elapsedTime) {
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(GregorianCalendar.YEAR);
		this.month = date.get(GregorianCalendar.MONTH);
		this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}
