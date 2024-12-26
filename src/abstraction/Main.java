package abstraction;
	public class Main {
	    public static void main(String[] args) {
	        BankAccount account = new SavingsAccount("John Doe");
	        account.displayHolderName();
	        account.calculateInterest();
	    }
	}

