package chapter11;

import java.util.Date;

/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 11:17:15 AM
 */
public class Exercise11_03 {
	public static void main(String[] args) {
		CheckingAccount acc1 = new CheckingAccount(1497547, 200, 4, 100);
		acc1.withdraw(250);
		SavingsAccount acc2 = new SavingsAccount(4154745, 300, 5);
		acc2.deposit(100);
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
	}
}
class SavingsAccount extends Account{
	public SavingsAccount(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
	}
	
	@Override
	public String toString() {
		return "account id: " + this.getId() + "\naccount balance: " + this.getBalance() +
				"\naccount creation at: " + this.getCreatedDate() + "\n";
	}
}

class CheckingAccount extends Account{
	private double overdraftLimit;
	
	public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
		super(id, balance, annualInterestRate);
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public void withdraw(double amount) {
		if (this.getBalance() + overdraftLimit - amount >= 0) {
			double balance = this.getBalance();
			double newBalance = balance - amount;
			this.setBalance(newBalance);
		}
	}
	@Override
	public String toString() {
		return "account id: " + this.getId() + "\naccount balance: " + this.getBalance() +
				"\naccount creation at: " + this.getCreatedDate() + "\n";
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