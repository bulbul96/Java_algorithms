package javapracticeWithShuvashish;

public class TestAccount{


		
		

		public static void main(String[] args) {
			
			
			Account account1=new Account(accountNumber: 1234, balance: 45.35);
			
			account1.withdraw(amount: 45);
			account1.deposit(amount: 65);
			System.out.println(account1.getBalance());
			
			
			Account account2=new Account(accountNumber: 1234, balance:45.35);
			
			
		}

	}


