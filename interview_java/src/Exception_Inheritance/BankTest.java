package Exception_Inheritance;
// Base class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new Exception("Insufficient funds");
        }
        balance -= amount;
    }
}

// Derived class for savings accounts
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void addInterest(double interestRate) {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); // Using the deposit method from BankAccount
    }
}

// Derived class for checking accounts
class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        // Checking overdraft limit
        if (amount > getBalance() + 100) { // Allow overdraft up to $100
            throw new Exception("Exceeds overdraft limit");
        }
        super.withdraw(amount); // Call the base class method
    }
}

// Test class
public class BankTest {
    public static void main(String[] args) {
        try {
            BankAccount myAccount = new SavingsAccount(500);
            myAccount.deposit(150);
            System.out.println("Balance after deposit: " + myAccount.getBalance());
            myAccount.withdraw(700); // This should throw an exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
