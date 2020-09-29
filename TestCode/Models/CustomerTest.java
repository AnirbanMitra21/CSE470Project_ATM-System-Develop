package Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer c;

    @Before
    public void setUp() throws Exception {
        c=new Customer(4,"Anirban","Mitra", "46,Dhanmondi","Dhaka","Bangladesh",1209,9876,"AnirbanArka21",1234567890);
    }

    @Test
    public void testgetPin() {
        assertEquals(9876, c.getPin());
    }

    @Test
    public void testgetPhone() {
        assertEquals(1234567890,c.getPhone());
    }

    @Test
    public void testgetSalt() {
        assertEquals(1,c.getSalt());
    }

    @Test
    public void testgetUsername() {
        assertEquals("AnirbanArka21",c.getUsername());
    }
}