package fr.flobzy.kata;

public class MyApp {

    public static void main(String[] args) {
        Account clientAccount = new Account(100);
        Client client = new Client("pierre-jean", clientAccount);

        AccountService accountService = new AccountServiceImpl();
        try {
            long amount = 10;
            System.out.println("Current balance of " + client.getName() + " account is : " + client.getAccount().getBalance() + " EUR");
            System.out.println("Withdrawing " + amount + " EUR from " + client.getName() + " account");
            accountService.withdraw(client.getAccount(), amount);
            System.out.println("Account balance is now : " + client.getAccount().getBalance() + " EUR");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
