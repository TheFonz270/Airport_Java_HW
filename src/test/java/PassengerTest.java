import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger pete;

    @Before
    public void before() {
        pete = new Passenger("Pete", 2);
    }

    @Test
    public void passengerExists(){
        assertEquals("Pete", pete.getName());
        assertEquals(2, pete.getBags());
    }

    @Test
    public void setBags() {
        assertEquals(2, pete.getBags());
        pete.setBags(3);
        assertEquals(3, pete.getBags());
    }
}
