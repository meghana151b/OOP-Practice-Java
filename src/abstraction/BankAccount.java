package abstraction;

abstract class BankAccount {
private String accountHolderName;

public BankAccount(String name) {
	this.accountHolderName=name;
}
abstract void calculateInterest();

public void displayHolderName() {
	System.out.println("Account Holder name"+accountHolderName);
}

}
