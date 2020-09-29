package Models;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import Models.Account;

public class AccountTest {
    Account a;
    @Before
    public void setUp() throws Exception {
        a= new Account(110,500,1, "2017-02-19 22:00:00", 111);
    }

    @Test
    public void testdepositAmount() {
        double x= a.depositAmount(200);
        assertEquals(700,x,0.1);
    }

    @Test
    public void testwithdrawAmount() {
        double x= a.withdrawAmount(300);
        assertEquals(200,x,0.1);
    }
}