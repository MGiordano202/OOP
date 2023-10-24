import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup() {
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest()
    {

        Bank bank = new Bank();
        bank.addAccount(0, "Charles");
        BankAccount newBankaccount =  bank.find(1);
        Assert.assertEquals(1, newBankaccount.getAccountNumber());
        newBankaccount.deposit(1000);
        Assert.assertEquals(1000, bank.getBalance(1),0);

    }

    @Test
    public void withdrawTest() {
        Bank bank = new Bank();
        bank.addAccount(1000, "Carlos");
        BankAccount newAccount = bank.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        bank.withdraw(1, 200);
        Assert.assertEquals(800, bank.getBalance(1), 0);
    }

    @Test
    public void transferTest() {
        Bank bank = new Bank();
        bank.addAccount(1000, "Max");
        bank.addAccount(1000, "Charles");

        bank.transfer(1, 2, 200);

        Assert.assertEquals(800, bank.getBalance(1), 0);
        Assert.assertEquals(1200, bank.getBalance(2), 0);
    }
}