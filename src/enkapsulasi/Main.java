package src.enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount lukasGlean = new BankAccount(100);

        lukasGlean.withdraw(100);
        System.out.println("Current balance is: " + lukasGlean.getBalance());
    }
}
