package chapter9;
import java.util.Date;
/**
 * @author Erlin Goce
 *
 * Jan 20, 2018 5:37:30 PM
 */
public class Exercise9_7 {
	public static void main(String[] args) {
		Account acc = new Account(1122, 20000, 4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("The balance of the account is " + acc.getBalance());
		System.out.println("The monthly interest of the account is " + acc.getMonthlyInterest());
		System.out.println("The date of creation of the account is " + acc.getCreatedDate());
	}
}
class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// Default no-arg constructor
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	// Custom arg constructor
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate / 100;
		this.dateCreated = new Date();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}
	
	public String getCreatedDate() {
		return this.dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return this.getMonthlyInterestRate() * balance;
	}
	
	public void withdraw(double amount) {
		if (this.balance - amount >= 0)
			this.balance -= amount;
		else
			return;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}
