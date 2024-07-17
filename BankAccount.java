package Lap4;

public class BankAccount {
	private String account;
	private double amount;
	private Date date;
	
	public BankAccount(String name) {
		account = name;
		amount = 0;
		date = new Date(16, 7, 2024);
		System.out.println("Create Acount Name : "+account);
		System.out.println("Amount : "+amount+" Bath");
		System.out.println("Openning Date : "+date.getterDay()+" "+date.getterMonth()+" "+date.getterYear());
	}
	public BankAccount(String name, double amount, Date date) {
		this.account = name;
		this.amount = amount;
		this.date = date;
		System.out.println("Create Acount Name : "+account);
		System.out.println("Amount : "+this.amount+" Bath");
		System.out.println("Openning Date : "+date.getterDay()+" "+date.getterMonth()+" "+date.getterYear());
	}
	public void deposit(double amount) {
		this.amount = this.amount+amount;
		System.out.println(this.account+" "+amount + " Bath Deposited Success!!!");
	}
	public boolean withdraw(double amount) {
		if(amount<=this.amount && amount>0) {
			this.amount = this.amount-amount;
			System.out.println(this.account+" "+amount+ " Bath Withdraw Success!!!");
			return true;
		}
		else {
			System.out.println("!! Sorry "+this.account+" Cant Withdraw.!!!");
			return false;
		}
	}
	public void tranfer(BankAccount other,double amount) {
		if(amount<=this.amount && amount>0) {
			this.amount = this.amount-amount;
			System.out.println(this.account+" "+amount + " Bath Transfer Success!!!");
			other.deposit(amount);
		}
		else {
			System.out.println("!! Sorry"+this.account+" Cant Transfer.!!!");
		}
	}
	public void property() {
		System.out.println("Current amount : "+this.amount);
	}
	public String getInfo() {
		return "Account : " + this.account + "\nOpening Date : " + this.date.getterDay() + " " 
				+ this.date.getterMonth() + " " + this.date.getterYear();
	}
	
}