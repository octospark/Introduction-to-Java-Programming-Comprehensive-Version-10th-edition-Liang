package chapter5;

public class Exercise39 {
	public static void main(String[] args) {
		double baseSalary = 5000;
		double yearSalary = 30000;
		double comissionSought = yearSalary - baseSalary;
		double comissions = 0;
		double sales = 0;
		while(comissions <= comissionSought) {
			if (sales < 5000) {
				comissions += 0.08;
			}
			else if(sales < 10000) {
				comissions += 0.1;
			}
			else {
				comissions += 0.12;
			}
			sales++;
		}
		System.out.printf("The amount of yearly sales for a $30000 year pay will be $%f", sales);
	}
}
