package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 29, 2018 12:15:02 PM
 */
public class Exercise10_08 {
	public static void main(String[] args) {
		double[] rates_2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets_2009 = {
				{0, 8350, 33950, 82250, 171550, 372950},  // Single filer
				{0, 16700, 67900, 137050, 20885, 372950}, // Married jointly
													   // -or qualifying widow(er)
				{0, 8350, 33950, 68525, 104425, 186475},  // Married separately
				{0, 11950, 45500, 117450, 190200, 372950} // Head of household
				};
		double[] rates_2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
		int[][] brackets_2001 = {
				{0, 27050, 65550, 136750, 297350},
				{0, 45200, 109250, 166500, 297350},
				{0, 22600, 54625, 83250, 148675},
				{0, 36250, 93650, 151650, 297350}
				};
		System.out.println("The taxes for years 2001 and 2009: ");
		for (int i = 0; i < 4; i++) {
			int taxableIncome = 50000;
			System.out.println("for status " + i + ", " + determineStatus(i));
			System.out.println("Taxable income   2001 Tax    2009 Tax");
			for (int j = taxableIncome; j <= 600000; j += 5000) {
				Tax t1 = new Tax(i, brackets_2001, rates_2001, j);
				Tax t2 = new Tax(i, brackets_2009, rates_2009, j);
				System.out.println(j + "           " + t1.getTax() + "     " + t2.getTax());
			}
			System.out.println();
			
		}
		
	}
	public static String determineStatus(int value) {
		if (value == 0) {
			return "single filer";
		}
		else if (value == 1)
			return "married jointly or qualifying widow(er)";
		else if (value == 2)
			return "married separately";
		else if (value == 3)
			return "head of household";
		else
			return "";
		}
}
class Tax {
	private int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	public Tax() {
		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	public double getTax() {
		int[] bracket = brackets[filingStatus];
		double tax = 0;
		// Find the index where the income falls in the brackets list
		int index = 0;
		while (taxableIncome > bracket[index]) {
			index++;
			if (index == bracket.length)
				break;
			}
		
		int start = 0;
		while (start < index - 1) {
			tax += (bracket[start + 1] - bracket[start]) * rates[start];
			start++;
		}
		start--;
		tax += (taxableIncome - bracket[start]) * rates[start];
		return tax;
	}
	
	public int getFilingStatus() {
		return filingStatus;
	}
	
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	public int[][] getBrackets() {
		return brackets;
	}
	
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	
	public double[] getRates() {
		return rates;
	}
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	
	public double getTaxableIncome() {
		return taxableIncome;
	}
	
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
}
