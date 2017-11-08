package fr.flobzy.kata;

public interface AccountService {

    void withdraw(Account account, long amount) throws Exception;
    void credit(Account account, long amount) throws Exception;
}
