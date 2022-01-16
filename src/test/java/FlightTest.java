import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Passenger passenger1;
    private Plane plane1;
    private Pilot joker;
    private CabinCrewMember firstOfficer;
    private CabinCrewMember flightAttendent;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    protected Flight flight;
    private Date DepartedAt;

    @Before
    public void before(){
        passenger1 = new Passenger("Jerry", 2);
        plane1 = new Plane(PlaneType.VESPA);
        joker = new Pilot("Joker", CabinCrewRank.Pilot, "QE345");
        firstOfficer = new CabinCrewMember("Frederik", CabinCrewRank.FirstOfficer);
        flightAttendent = new CabinCrewMember("Julie", CabinCrewRank.FlightAttendant);
        crew = new ArrayList<CabinCrewMember>();
        crew.add(firstOfficer);
        crew.add(flightAttendent);
        passengers = new ArrayList<Passenger>();
        DepartedAt = new Date(122, 00, 16, 15, 30);
        flight = new Flight(joker, crew, plane1, "NSE3456", "GLA", "EDI", DepartedAt);
    }

    @Test
    public void flightExists(){
        assertEquals("Joker", flight.pilot.getName());
        assertEquals("Frederik", flight.getCrew().get(0).getName());
        assertEquals(flight.getPlane().getPlaneType(), PlaneType.VESPA);
        assertEquals(flight.getFlightNumber(), "NSE3456");
        assertEquals(flight.getDestination(), "GLA");
        assertEquals(flight.getDepartedFrom(), "EDI");
        assertEquals(flight.getDepartedAt(), DepartedAt);
        System.out.println(DepartedAt);
    }

    @Test
    public void canCheckAvailability(){
        assertEquals(10, flight.checkAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        assertEquals(10, flight.checkAvailableSeats());
        flight.bookPassenger(passenger1);
        assertEquals(9, flight.checkAvailableSeats());
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Welcome to flight NSE3456 from EDI to GLA", joker.flyPlane(flight));
    }

    @Test
    public void crewCanAnnounce(){
        assertEquals("Welcome to flight NSE3456 from EDI to GLA", firstOfficer.makeAnnouncement(flight));
    }

}
