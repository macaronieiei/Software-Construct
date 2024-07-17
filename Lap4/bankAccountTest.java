package lap4;

public class BankAccountTest {

	public static void main(String[] args) {
		//Test Create New Acc Amount = 0
		System.out.println("Customer "+BankAccount.count);
		BankAccount customer1 = new BankAccount("Bank1");
		System.out.println();
		
		//Test Crearte New Acc Amount > 0
		//Date date = new Date(1, 11, 2015);
		System.out.println("Customer "+BankAccount.count);
		BankAccount customer2 = new BankAccount("Bank2",500,new Date(1, 11, 2015));
		System.out.println();
		
		//Test Deposit
		customer1.deposit(1000);
		//System.out.println(customer1.property());
		System.out.println();
		
		//Test Tranfer
		customer2.tranfer(customer1, 300);
		/*System.out.print("Account 1 ");
		System.out.println(customer1.property());
		System.out.print("Account 2 ");
		System.out.println(customer2.property());*/
		System.out.println();
		
		//Test Withdraw
		customer2.withdraw(300);
		System.out.println();
		
		//Test Property
		System.out.println(customer1.getInfo()+"\nCurrent amount : "+customer1.getAmount()+" Bath");
		System.out.println();
		System.out.println(customer2.getInfo()+"\nCurrent amount : "+customer2.getAmount()+" Bath");
	}
}
