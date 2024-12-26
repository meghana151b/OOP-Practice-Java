package abstraction;

class SavingsAccount extends BankAccount {
	public SavingsAccount(String name) {
		super(name);
	}
	  @Override
	    void calculateInterest() {
	        System.out.println("Calculating interest for Savings Account");
	    }

}
