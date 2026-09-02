public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Kamal", 500.0);
        Account acc2 = new Account("Sara",1200.0);

        acc1.printDetails();
        System.out.println("---");
        acc2.printDetails();
    }
}
