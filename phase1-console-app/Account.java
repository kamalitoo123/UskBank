public class Account {
    String ownerName;
    double balance;
    boolean isActive;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.isActive = true;
    }

    public void printDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("Active: " + isActive);
    }
}
