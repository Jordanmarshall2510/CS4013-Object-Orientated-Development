import java.util.*;

public class TestBankAccounts{
	public static void main (String [] args){

		BankAccount banker = new BankAccount();

		ArrayList <BankAccount> accounts = new ArrayList<> ();

		SavingsAccount p1 = new SavingsAccount (1567,100);
		SavingsAccount p2 = new SavingsAccount (7821,30);

		accounts.add(p1);
		accounts.add(p2);

		CurrentAccount p3 = new CurrentAccount(4581, 90);
		CurrentAccount p4 = new CurrentAccount(1617, 30);

		accounts.add(p3);
		accounts.add(p4);

		p1.withdraw(110);
		p1.deposit(200);

		p2.withdraw(20);
		p2.deposit(230);

		p3.withdraw(110);
		p3.deposit(90);

		p4.withdraw(20);
		p4.deposit(50);

		for(int i = 0; i < accounts.size(); i++){
			System.out.println(accounts.get(i).toString());
		}
	}

}