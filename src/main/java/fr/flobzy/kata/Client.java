package fr.flobzy.kata;

public class Client {
    private final String name;
    private final Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
