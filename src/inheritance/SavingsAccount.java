package inheritance;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	
	public SavingsAccount(String name,double balance,double interestRate) {
		super(name,balance);
		this.interestRate=interestRate;
	}
	public void addInterest() {
		 double interest = (interestRate / 100) * super.getBalance();
	        super.deposit(interest); 
	        System.out.println("Interest added: " + interest);	
	}
	 @Override
	    public void displayBalance() {
	        super.displayBalance();
	        System.out.println("Interest Rate: " + interestRate + "%");
	    }

}
