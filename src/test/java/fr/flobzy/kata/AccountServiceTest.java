package fr.flobzy.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AccountServiceTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    private Client client;
    private AccountService accountService = new AccountServiceImpl();

    @Test
    public void shouldSuccessfullyCreditAccount() throws Exception {
        accountService.credit(client.getAccount(), 100);
        Assert.assertEquals(150, client.getAccount().getBalance());
    }

    @Test
    public void shouldNotSuccessfullyCreditAccount() throws Exception {
        exception.expect(Exception.class);
        accountService.credit(client.getAccount(), -12);
    }

    @Test
    public void shouldSuccessfullyWithdrawFromAccount() throws Exception {
        accountService.withdraw(client.getAccount(), 50);
        Assert.assertEquals(0, client.getAccount().getBalance());
    }

    @Test
    public void shouldNotSuccessfullyWithdrawFromAccountBecauseOfBalance() throws Exception {
        exception.expect(Exception.class);
        accountService.withdraw(client.getAccount(), 100);
    }

    @Test
    public void shouldNotSuccessfullyWithdrawFromAccountBecauseOfNegativeAmount() throws Exception {
        exception.expect(Exception.class);
        accountService.withdraw(client.getAccount(), -30);
    }

    @Before
    public void init() {
        Account account = new Account(50);
        client = new Client("test-client", account);
    }
}
