package Lap4;

public class bankAccountTest {

	public static void main(String[] args) {
		//Test Create New Acc Amount = 0
		System.out.println("Customer1");
		BankAccount customer1 = new BankAccount("Bank1");
		System.out.println();
		
		//Test Crearte New Acc Amount > 0
		System.out.println("Customer2");
		Date date = new Date(1, 11, 2015);
		BankAccount customer2 = new BankAccount("Bank2",500,date);
		System.out.println();
		
		//Test Deposit
		customer1.deposit(1000);
		//customer1.property();
		System.out.println();
		
		//Test Tranfer
		customer2.tranfer(customer1, 300);
		/*System.out.print("Account 1 ");
		customer1.property();
		System.out.print("Account 2 ");
		customer2.property();*/
		System.out.println();
		
		//Test Withdraw
		customer2.withdraw(300);
		System.out.println();
		
		//Test Property
		System.out.println(customer1.getInfo());
		customer1.property();
		System.out.println();
		System.out.println(customer2.getInfo());
		customer2.property();
	}
}