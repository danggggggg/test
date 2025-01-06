import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testCreateAccount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testDepositValidAmount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testDepositInvalidAmount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
    }

    @Test
    void testWithdrawValidAmount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance());
    }

    @Test
    void testWithdrawInvalidAmount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(1500.0));
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-200.0));
    }
}
