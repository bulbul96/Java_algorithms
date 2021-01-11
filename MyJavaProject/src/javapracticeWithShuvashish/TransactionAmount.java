package javapracticeWithShuvashish;

public class TransactionAmount {
	
	

		public static void main(String[] args) {
		Bank_Account rajib = new Bank_Account();
		rajib.deposit(1000);
		Bank_Account david = new Bank_Account();
		david.deposit(2000);
		// do transfer....
		rajib.transfer(100, david);
		System.out.println(rajib.getBalance());
		System.out.println(david.getBalance());

		//withdraw...
		rajib.withdraw(500);
		System.out.println(rajib.getBalance());


		david.withdraw(2500);
		System.out.println(david.getBalance());

		david.deposit(2500);
		System.out.println(david.getBalance());


		}

		}


