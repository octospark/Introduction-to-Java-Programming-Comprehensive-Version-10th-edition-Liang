package chapter11;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 1:19:20 PM
 */
public class Exercise11_08 {
	public static void main(String[] args) {
		Account_2 acc = new Account_2("George", 1122, 1000, 1.5);
		acc.deposit(30);
		acc.deposit(40);
		acc.deposit(50);
		acc.withdraw(5);
		acc.withdraw(10);
		acc.withdraw(15);
		
		acc.printTransactions();
	}
}
class Account_2{
	private int id;
	private String name;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transactions> transactions = new ArrayList<>();
	private Scanner input;
	
	// Default no-arg constructor
	public Account_2() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.name = "NoName";
		this.dateCreated = new Date();
	}
	// Custom arg constructor
	public Account_2(String name, int id, double balance, double annualInterestRate) {
		this.name = name;
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
		if (this.balance - amount >= 0) {
			this.balance -= amount;
			input = new Scanner(System.in);
			System.out.println("Enter description for transaction: ");
			String desc = input.nextLine();
			transactions.add(new Transactions('W', amount, this.getBalance(), desc));
			
			}
		else
			return;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		input = new Scanner(System.in);
		System.out.println("Enter description for transaction: ");
		String desc = input.nextLine();
		transactions.add(new Transactions('D', amount, this.getBalance(), desc));
		
	}
	public String getName() {
		return name;
	}
	
	public void printTransactions(){
		for (int i = 0; i < transactions.size(); i++)
			System.out.println(transactions.get(i).toString());
	}
}

class Transactions{
	private Date dateCreated;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transactions(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		this.dateCreated = new Date();
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Date of transaction: " + this.getDateCreated() +
				" \nType of transaction: " + this.getType() + 
				"\nDescription: " + this.getDescription() +
				"\nAmount: " + this.getAmount() + 
				"\nBalance: " + this.getBalance() + "\n";
	}
}