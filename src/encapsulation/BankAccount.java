package encapsulation;

public class BankAccount {
	private String name;
	private double balance;
	public BankAccount(String name,double balance){
		this.name=name;
		this.balance=balance;
		}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
		}
		else {
			System.out.println("Invalid");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
		}
		else{
			System.out.println("Invalid transaction");
		}
	}
	public void displayBalance() {
		System.out.println("Balance "+balance);
	}

}
