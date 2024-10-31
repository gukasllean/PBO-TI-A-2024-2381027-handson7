package enkapsulasi;

public class BankAccount {
    private double balance;

    public BankAccount(final double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            balance = jumlah;
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && balance >= jumlah) {
            balance -= jumlah;
        }
    }
}
