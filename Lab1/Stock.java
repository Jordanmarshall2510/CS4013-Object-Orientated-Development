public class Stock{

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String newSymbol, String newName ){
		symbol = newSymbol;
		name = newName;
		currentPrice = 79.65;
		previousClosingPrice = 79.45;
		System.out.println("Stock Name: "+ newName);
		System.out.println("Stock Symbol: "+ newSymbol);
		System.out.println("Stock Percentage Change: "+ getChangePercentage());


	}

	public double getChangePercentage(){
		return ((currentPrice/previousClosingPrice)*100)-100;
	}
}