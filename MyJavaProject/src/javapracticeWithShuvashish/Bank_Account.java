package javapracticeWithShuvashish;

public class Bank_Account {

	
		private double balance;
		private String accountNumber;

		public void deposit(double amount) {

		balance = balance + amount;

		}

		public void withdraw(double amount) {
		if (amount <= balance) {
		balance = balance - amount;
		} else {
		System.out.println("insufficient fund");
		}
		}

		public double getBalance() {
		return balance;
		}

		public void transfer(double amount, Bank_Account otherAccount) {
		otherAccount.deposit(amount);
		balance = balance - amount;
		}

		}