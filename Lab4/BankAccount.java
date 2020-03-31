public class BankAccount{

	private int id;
	private double balance;
	private double annualInterestRate;
	//private LocalDate dataCreated;

	public BankAccount(){

	}

	public BankAccount(int id, double balance){
		this.id = id;
		this.balance = balance;

	}

	public void setId(int id){
		this.id = id;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public int getId(){
		return id;
	}

	public double getBalance(){
		return balance;
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}

	public void setAnnualRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	public double withdraw(double amount){
		balance = balance - amount;
		return balance;
	}

	public double deposit(double amount){
		balance = balance + amount;
		return balance;
	}

	public String toString(){
		return "Id: "+id +"\t"+ "Balance: " + balance;
	}

}