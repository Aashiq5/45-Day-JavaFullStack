/*Question-5: Developing a Banking Application with Polymorphism in Java
You are tasked with developing a banking application in Java that
can handle different types of accounts, such as Savings Accounts and
Checking Accounts. The application should demonstrate the
use of polymorphism to provide a common interface for various account types
while allowing each type to have its own specific functionality.

Requirements:

a) Implement a common interface, BankAccount, with methods for displaying the
account balance (displayBalance) and performing a transaction (performTransaction).

b)Create a SavingsAccount class that extends the BankAccount interface.
This class should include an additional method, applyInterest,
which represents the specific logic for applying interest to a savings account.

c)Implement a CheckingAccount class that also extends the
BankAccount interface. Override the performTransaction method
to allow for overdrafts and include an appropriate overdraft limit.

d) In the main class (PolymorphismExample), demonstrate polymorphic behavior by
creating instances of both SavingsAccount and CheckingAccount using the BankAccount
 interface.

e)Display the initial balances, perform transactions, and
showcase specific behaviors such as applying interest to savings accounts
and handling overdrafts in checking accounts.

f) Finally, display the updated balances after the transactions.*/
interface BankAccount {
    void displayBalance();
    void performTransactions(double amount);
}

class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    @Override
    public void performTransactions(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " processed.");
        } else {
            System.out.println("Cannot process negative amount for savings account.");
        }
    }

    public void applyInterest(double rate) {
        balance += balance * rate;
        System.out.println("Interest applied. New balance: " + balance);
    }
}

class CheckingAccount implements BankAccount {
    private double balance;
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayBalance() {
        System.out.println("Checking Account Balance: " + balance);
    }

    @Override
    public void performTransactions(double amount) {
        if (balance + amount >= overdraftLimit) {
            balance += amount;
            System.out.println("Transaction of " + amount + " processed.");
        } else {
            System.out.println("Cannot process transaction. Overdraft limit exceeded.");
        }
    }

    public void handleOverdraft() {
        if (balance < 0) {
            System.out.println("Overdraft occurred. Fee charged.");
            balance -= 20; // Example fee for overdraft
        }
    }
}

class PolymorphismExample {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(500, -1000);

        // Display initial balances
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();

        // Perform transactions
        savingsAccount.performTransactions(200);
        checkingAccount.performTransactions(-600);

        // Apply interest to savings account
        savingsAccount.applyInterest(0.05); // 5% interest rate

        // Handle overdraft in checking account
        checkingAccount.handleOverdraft();

        // Display updated balances
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();
    }
}
