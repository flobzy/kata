package fr.flobzy.kata;

public class AccountServiceImpl implements AccountService {

    public void withdraw(Account account, long amount) throws Exception {
        if(account.getBalance() > 0 && account.getBalance() >= amount && amount > 0) {
            account.withdraw(amount);
        } else {
            throw new Exception("The account is not enough provided or amount is incorrect.");
        }
    }

    public void credit(Account account, long amount) throws Exception {
        if(amount > 0) {
            account.credit(amount);
        } else {
            throw new Exception("It is not possible to credit negative amounts");
        }
    }

}
