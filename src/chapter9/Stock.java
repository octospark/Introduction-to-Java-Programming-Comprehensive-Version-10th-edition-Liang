package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 20, 2018 4:35:10 PM
 */
public class Stock {
	public static void main(String[] args) {
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.setPreviousClosingPrice(34.5);
		s1.setCurrentPrice(36);
		double changePercentage = s1.getChangePercent();
		System.out.println("The price of the stock changed %" + changePercentage);
	}
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getChangePercent() {
		return 100.0 * (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
}
