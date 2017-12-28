package chapter4;
import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employe's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		// calculate gross pay, deduction taxes and calculate the net pay
		double grossPay = hours * payRate;
		double federalTax = federalTaxRate * grossPay;
		double stateTax = stateTaxRate * grossPay;
		double totalTax = stateTax + federalTax;
		double netPay = grossPay - totalTax;
		System.out.printf("\n\n\n");
		System.out.println("Employee Name: " + name);
		System.out.printf("Hours Worked: %4.2f\n", hours);
		System.out.printf("Pay Rate: $%.2f\n", payRate);
		System.out.printf("Gross Pay: $%.2f\n", grossPay);
		System.out.println("Deductions:");
		System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", federalTaxRate * 100, federalTax);
		System.out.printf("\tState Withholding (%.2f%%): $%.2f\n", stateTaxRate * 100, stateTax);
		System.out.printf("\tTotal Deduction: $%.2f\n", totalTax);
		System.out.printf("Net Pay: $%.2f\n", netPay);
		input.close();
	}
}
