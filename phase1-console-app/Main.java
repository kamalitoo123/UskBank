import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Kamal", 500.0);


        acc1.deposit(200.0);
        acc1.withdraw(100.0);

        System.out.println("---");

        try {

            acc1.withdraw(10000.0);
        } catch (IllegalStateException e) {
            System.out.println("Withdraw failed: " + e.getMessage());
        }

        System.out.println("---");
        acc1.printDetails();
    }
}
