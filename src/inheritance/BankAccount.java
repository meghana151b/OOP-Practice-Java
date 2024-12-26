package inheritance;

public class BankAccount {
	private String name;
	private double balance;
	public BankAccount(String name,double balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;	
	}
public void withdraw(double amount) {
	if(amount>0 && amount<=balance) {
		balance=balance-amount;
	}
	else {
		System.out.println("Invalid trasaction");
	}
}
public void deposit(double amount) {
	if(amount>0) {
		balance=balance+amount;
		}
	else {
		System.out.println("Invalid");
	}
}
protected double getBalance() { // Changed to protected
    return balance;
}
public void displayBalance() {
	System.out.println("Balance "+balance);
}
}
