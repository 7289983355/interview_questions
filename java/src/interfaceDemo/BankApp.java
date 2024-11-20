package interfaceDemo;

interface Account {
	// Default method in the interface
	default void deposit(double amount) {
		System.out.println("Depositing " + amount + " to Account");
	}

	// Private method in the interface (new in Java 9)
	private void internalAudit() {
		System.out.println("Internal audit for account");
	}

	// Static method in the interface (available since Java 8)
	static void showAccountDetails(String accountType) {
		System.out.println("Account Type: " + accountType);
	}

	// Abstract method that must be implemented
	void withdraw(double amount);
}

class SavingsAccount implements Account {
	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " from Savings Account");
	}

	// Overriding the default deposit method
	@Override
	public void deposit(double amount) {
		System.out.println("Depositing " + amount + " to Savings Account");
	}
}

class CheckingAccount implements Account {
	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " from Checking Account");
	}

	// Not overriding deposit method, so it will use the default method
}

public class BankApp {
	public static void main(String[] args) {
		// Using static method from interface
		Account.showAccountDetails("Savings");

		// SavingsAccount uses overridden deposit method
		SavingsAccount savings = new SavingsAccount();
		savings.deposit(100.0);
		savings.withdraw(50.0);

		// CheckingAccount uses default deposit method
		CheckingAccount checking = new CheckingAccount();
		checking.deposit(200.0);
		checking.withdraw(100.0);

		// Attempt to call private method (this will result in a compile-time error)
		// checking.internalAudit(); // Uncommenting this will cause a compilation error
	}
}
