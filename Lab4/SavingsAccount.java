public class SavingsAccount extends BankAccount{

	private int id;
	private double balance;
	private double annualInterestRate;
	//private LocalDate dataCreated;

	public SavingsAccount(){

	}

	public SavingsAccount(int id, double balance){
		super(id, balance);
	}

	@Override
	public double withdraw(double amount){
		if(getBalance() >= amount) {
			setBalance(getBalance() - amount);
		}else{
			System.out.println("Error");
		}
		return amount;
	}

	public double deposit(double amount){
		balance = balance + amount;
		return balance;
	}

	public String toString(){
		return super.toString();
	}

}