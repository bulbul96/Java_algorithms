package javapracticeWithShuvashish;

public class BankAccount {
	 
	
    public BankAccount(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
    {
        // create two BankAccount objects
        BankAccount first = new BankAccount("1111111", 20000);
        BankAccount second = new BankAccount("2222222", 30000);

        // print initial balances
        System.out.printf("Account #%s has initial balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has initial balance of $%.2f%n",
                second.getAccount(), second.getBalance());

        // transfer $5000 from first to second account (via transferFundsA())
        first.transferFundsA(second, 5000);

        // print new balances
        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getAccount(), second.getBalance());

        // transfer $10000 from second account to first (via transferFundsB())
        second.transferFundsA(first, 10000);

        // print new balances
        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getAccount(), second.getBalance());
    }

	private void transferFundsA(BankAccount second, int i) {
		// TODO Auto-generated method stub
		
	}

	private Object getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getAccount() {
		// TODO Auto-generated method stub
		return null;
	}
}

/* program output

Account #1111111 has initial balance of $20,000.00
Account #2222222 has initial balance of $30,000.00

After "first.transferFundsA(second, 5000)" ...

Account #1111111 has new balance of $15,000.00
Account #2222222 has new balance of $35,000.00

After "second.transferFundsB(first, 10000)" ...

Account #1111111 has new balance of $25,000.00
Account #2222222 has new balance of $25,000.00

*/

