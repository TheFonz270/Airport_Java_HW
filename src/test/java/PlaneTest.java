import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.CONCORD);
        plane3 = new Plane(PlaneType.VESPA);
    }

    @Test
    public void plane1Exists(){
        assertEquals(PlaneType.BOEING747, plane1.getPlaneType());
        assertEquals(747, plane1.getCapacity());
        assertEquals(7747, plane1.getTotalWeight());
    }

    @Test
    public void plane2Exists(){
        assertEquals(PlaneType.CONCORD, plane2.getPlaneType());
        assertEquals(500, plane2.getCapacity());
        assertEquals(6000, plane2.getTotalWeight());
    }

    @Test
    public void plane3Exists(){
        assertEquals(PlaneType.VESPA, plane3.getPlaneType());
        assertEquals(10, plane3.getCapacity());
        assertEquals(1000, plane3.getTotalWeight());
    }
}
