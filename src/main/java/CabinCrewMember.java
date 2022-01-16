public class CabinCrewMember extends Staff{

    public CabinCrewMember(String name, CabinCrewRank rank) {
        super(name, rank);
    }

    public String makeAnnouncement(Flight flight){
            return "Welcome to flight " + flight.getFlightNumber() + " from " + flight.getDepartedFrom() + " to " + flight.getDestination();

    }
}
