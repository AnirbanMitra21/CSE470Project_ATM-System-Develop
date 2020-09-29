package Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTypeTest {
    AccountType a;

    @Before
    public void setUp() throws Exception {
        a=new AccountType(1,"Checking Account");
    }

    @Test
    public void testgetAccountType() {
        assertEquals(1,a.getAccountType());
    }

    @Test
    public void testgetType() {
        assertEquals("Checking Account",a.getType());
    }
}