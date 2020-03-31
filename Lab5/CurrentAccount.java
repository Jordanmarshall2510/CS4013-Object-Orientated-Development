import java.time.LocalDateTime;
import java.util.ArrayList;

public class CurrentAccount extends BankAccount{

	private int id;
	private double balance;
	private double annualInterestRate;
	private LocalDateTime dataCreated;
	private double overdraftLimit;
	private String name;
	private ArrayList<Transaction> Transaction = new ArrayList<Transaction>();

	public CurrentAccount(){

	}

	public CurrentAccount(int id, double balance){
		super(id, balance);
	}

	public CurrentAccount(String name, int id, double balance){
		super(name, id, balance);
	}

	@Override
	public double withdraw(double amount){
		if(overdraftLimit <= amount) {
			setBalance(getBalance() - amount);
		}else{
			System.out.println("Error");
		}
		Transaction.add(new Transaction('w',amount,balance,"Withdraw"));
		return amount;
	}

	@Override
	public double deposit(double amount){
		balance = balance + amount;
		Transaction.add(new Transaction('d',amount,balance,"Deposit"));
		return balance;
	}

	public String toString(){
		return super.toString();
	}

}