package encapsulation;

public class Main {

	public static void main(String[] args) {
		BankAccount account=new BankAccount("Meg",1000);
		account.withdraw(300);
		account.deposit(500);
		account.displayBalance();
		

	}

}
