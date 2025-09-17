abstract class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance = " + balance);
    }
    abstract void withdraw(double amount);
    void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance = " + balance);
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SavingsAccount Withdrawn: " + amount + ", Remaining Balance = " + balance);
        } else {
            System.out.println("SavingsAccount: Insufficient balance! Withdrawal denied.");
        }
    }
}
class CurrentAccount extends BankAccount {
    final double overdraftLimit = 10000;
    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("CurrentAccount Withdrawn: " + amount + ", Remaining Balance = " + balance);
        } else {
            System.out.println("CurrentAccount: Overdraft limit exceeded! Withdrawal denied.");
        }
    }
}
public class BankTest {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(101, 5000);
        BankAccount ca = new CurrentAccount(102, 2000);
        sa.deposit(2000);
        sa.withdraw(6000);
        sa.withdraw(2000);  
        sa.displayBalance();
    }
}
