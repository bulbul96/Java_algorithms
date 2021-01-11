package javapracticeWithShuvashish;

public class Account {

	private int accountNumber;
	private double balance;
	
	Account(int accountNumber, double balance){//constructor
		
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("your balance is now $" +balance);
		
		
	}
	public void withdraw(double amount) {
		if(amount<balance) {
			balance=balance-amount;
		}else
			System.out.println("you don't have enough money to withdraw");
		System.out.println("your balance is " +balance);
	}
}
		
