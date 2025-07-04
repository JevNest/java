abstract class BankAccount {
    private String AccountHolderName;
    private double Balance;

    public BankAccount(String AccountHolderName, double Balance) {
        this.AccountHolderName = AccountHolderName;
        this.Balance = Balance;
    }

    public abstract void displayDetails();

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Deposited amount: " + amount);
            Balance += amount;
        } else {
            System.out.println("Deposit proper amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            System.out.println("Withdraw amount: " + amount);
            Balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String AccountHolderName, double Balance) {
        super(AccountHolderName, Balance);
    }

    @Override
    public void displayDetails() {
        System.out.println("Savings Account");
        System.out.println("Account Name: " + getAccountHolderName());
        System.out.println("Account Balance: " + getBalance());
    }
}

public class Main {
    public static void main(String[] args){
        BankAccount savings = new SavingsAccount("Murali", 1000.00);
        savings.displayDetails();
        savings.deposit(5000.00);
        savings.withdraw(100.00);
        savings.displayDetails();
    }
}
