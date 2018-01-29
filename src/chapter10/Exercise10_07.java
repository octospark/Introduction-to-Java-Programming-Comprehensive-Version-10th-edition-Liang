package chapter10;

import java.util.Date;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 29, 2018 11:46:21 AM
 */
public class Exercise10_07 {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100, 0);
		}
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an id: ");
			int id = input.nextInt();
			if (id > 10)
				System.exit(1);
			int choice = 0;
			while (choice != 4) {
				printMenu();
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				Account account = accounts[id];
				if (choice == 1)
					System.out.println("The balance is " + account.getBalance());
				else if (choice == 2) {
					System.out.print("Enter the amount to withdraw: ");
					double amount = input.nextDouble();
					account.withdraw(amount);
				}
				else if (choice == 3) {
					System.out.print("Enter the amount to deposit: ");
					double amount = input.nextDouble();
					account.deposit(amount);
				}
			}
			
		}
	}
	public static void printMenu() {
		System.out.println("\nMain Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");	
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
