public class CurrentAccount extends BankAccount{

	private int id;
	private double balance;
	private double annualInterestRate;
	//private LocalDate dataCreated;
	private double overdraftLimit;

	public CurrentAccount(){

	}

	public CurrentAccount(int id, double balance){
		super(id, balance);
	}

	@Override
	public double withdraw(double amount){
		if(overdraftLimit <= amount) {
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