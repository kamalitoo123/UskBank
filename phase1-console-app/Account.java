public class Account {
    private String ownerName;
    private double balance;
    private boolean isActive;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.isActive = true;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposited " + amount + ". New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds. Current balance: " + balance);
        }
        balance = balance - amount;
        System.out.println("Withdraw " + amount + ". New Balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }

    public void printDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("Active: " + isActive);
    }
}
