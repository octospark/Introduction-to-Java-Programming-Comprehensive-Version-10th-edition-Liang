package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 21, 2018 2:25:26 PM
 */
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	// Default constructor
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	/** Construct a loan with specified annual interest rate,
	 * number of years, and loan amount */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** Set a new annualIneterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/** Return numberOfYears */
	public double getNumberOfYears() {
		return numberOfYears;
	}
	
	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
	/** Return loan amount */
	public double getLoanAmount() {
		return loanAmount;
	}
	
	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public String getLoanDate(){
		return loanDate.toString();
	}
}
