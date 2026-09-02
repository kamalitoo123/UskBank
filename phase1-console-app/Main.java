import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Kamal", 500.0);

        acc1.printDetails();
        System.out.println("---");

        acc1.deposit(200.0);
        acc1.withdraw(100.0);

        System.out.println("---");
        acc1.withdraw(10000.0);

        System.out.println("---");
        acc1.printDetails();
    }
}
