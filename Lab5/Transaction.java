import java.time.LocalDateTime;

public class Transaction extends BankAccount{

	private LocalDateTime date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	public Transaction(){

	}

	public Transaction(char type, double amount, double balance, String description){
		if(type == 'w'){
			this.type = 'w';
			this.amount = amount;
			this.balance = balance - amount;
			this.description = description;
			toString();
		}else if (type == 'd'){
			this.type = 'd';
			this.amount = amount;
			this.balance = balance - amount;
			this.description = description;
			toString();
		}
	}

	public String toString(){
		return "Date: " + date + "Type: "+type+ "Amount: "+ amount+ "Balance: "+ balance+ "Description: " + description;
	}

}