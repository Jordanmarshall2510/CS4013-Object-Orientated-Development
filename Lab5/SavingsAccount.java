import java.time.LocalDateTime;
import java.util.ArrayList;

public class SavingsAccount extends BankAccount{

	private int id;
	private double balance;
	private double annualInterestRate;
	private LocalDateTime dataCreated;
	private String name;
	private ArrayList<Transaction> Transaction = new ArrayList<Transaction>();

	public SavingsAccount(){

	}

	public SavingsAccount(int id, double balance){
		super(id, balance);
	}

	public SavingsAccount(String name, int id, double balance){
		super(name, id, balance);
	}

	@Override
	public double withdraw(double amount){
		if(getBalance() >= amount) {
			super.withdraw(amount);
		}else{
			System.out.println("Error");
		}
		return amount;
	}

	@Override
	public double deposit(double amount){
		return super.deposit(amount);
	}

	public String toString(){
		return super.toString();
	}

}