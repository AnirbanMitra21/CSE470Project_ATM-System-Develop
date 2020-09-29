package Views;

import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class AtmViewTest {
    AtmView a;
    @Before
    public void setUp() throws Exception {
        a = new AtmView();
    }

    @Test
    public void testdisplayBalance() {
        assertEquals(200,a.displayBalance(200), 0.1);
    }

    @Test
    public void testdisplayFirstName() {
        assertEquals("Anirban",a.displayFirstName("Anirban"));
    }

    @Test
    public void testdisplayMessage() {
        assertEquals("Done",a.displayMessage("Done"));
    }
}