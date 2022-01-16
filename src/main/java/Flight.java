import java.util.ArrayList;
import java.util.Date;

public class Flight {

    protected Pilot pilot;
    protected Pilot coPilot;
    protected ArrayList<CabinCrewMember> crew;
    protected ArrayList<Passenger> passengers;
    protected Plane plane;
    protected String flightNumber;
    protected String destination;
    protected String departedFrom;
    protected Date departedAt;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crew, Plane plane, String flightNumber, String destination, String departedFrom, Date departedAt){
        this.pilot = pilot;
        this.crew = crew;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departedFrom = departedFrom;
        this.departedAt = departedAt;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(Pilot coPilot) {
        this.coPilot = coPilot;
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartedFrom() {
        return departedFrom;
    }

    public Date getDepartedAt() {
        return departedAt;
    }

    public int checkAvailableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (this.passengers.size() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
        else {
            System.out.println("Sorry flight is full");
        }
    }
}

