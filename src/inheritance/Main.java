package inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("Alice", 1000, 5.0);

        // Perform operations
        savingsAccount.displayBalance();   // Display initial details
        savingsAccount.deposit(500);       // Deposit money
        savingsAccount.withdraw(300);      // Withdraw money
        savingsAccount.addInterest();      // Add interest
        savingsAccount.displayBalance();   // Display updated details
    }
}
