package Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseAccountTest {
    BaseAccount a;
    @Before
    public void setUp() throws Exception {
        a= new BaseAccount(2302203, 100000, 2, "2017-02-23 10:59:00", 4) {
            @Override
            public double depositAmount(double add) {
                return 0;
            }

            @Override
            public double withdrawAmount(double amount) {

                return amount;
            }
        };
    }

    @Test
    public void testgetAccountNumber() {
        assertEquals(2302203,a.getAccountNumber());
    }

    @Test
    public void testgetAccountTypeId() {
        assertEquals(2, a.getAccountTypeId());
    }

    @Test
    public void testgetBalance() {
        assertEquals(100000,a.getBalance(),.1);
    }

    @Test
    public void testgetCustomerId() {
        assertEquals(4,a.getCustomerId());
    }
}