import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember firstOfficer;
    private CabinCrewMember flightAttendent;

    @Before
    public void before(){
        firstOfficer = new CabinCrewMember("Steven", CabinCrewRank.FirstOfficer);
        flightAttendent = new CabinCrewMember("Julie", CabinCrewRank.FlightAttendant);
    }

    @Test
    public void crewExists(){
        assertEquals(firstOfficer.getName(), "Steven");
        assertEquals(firstOfficer.getRank(), CabinCrewRank.FirstOfficer);
        assertEquals(flightAttendent.getName(), "Julie");
        assertEquals(flightAttendent.getRank(), CabinCrewRank.FlightAttendant);
    }

}