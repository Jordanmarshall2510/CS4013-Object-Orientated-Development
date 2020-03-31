import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount{

	private int id;
	private double balance;
	private double annualInterestRate;
	private String name;
	private LocalDateTime dataCreated;
	private ArrayList<Transaction> Transaction = new ArrayList<Transaction>();

	public BankAccount(){

	}

	public BankAccount(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	public BankAccount(String name, int id, double balance){
		this.name= name;
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
		Transaction.add(new Transaction('w',amount,balance,"Withdraw"));
		return balance;
	}

	public double deposit(double amount){
		balance = balance + amount;
		Transaction.add(new Transaction('d',amount,balance,"Deposit"));
		return balance;
	}

	public String toString(){
		return "Id: "+id +"\t"+ "Balance: " + balance;
	}

	public LocalDateTime getDateCreated(){
		return dataCreated;
	}

}