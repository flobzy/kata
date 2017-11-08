package fr.flobzy.kata;

public class Account {
    private long balance;

    public Account() {
        this.balance = 0;
    }

    public Account(long balance) {
        this.balance = balance;
    }

    protected void withdraw(long amount) {
        this.balance -= amount;
    }

    protected void credit(long amount) {
        this.balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}
