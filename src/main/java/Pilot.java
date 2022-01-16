public class Pilot extends CabinCrewMember {

    protected String pilotLicenseNumber;

    public Pilot(String name, CabinCrewRank rank, String pilotLicenseNumber) {
        super(name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
        this.rank = CabinCrewRank.Pilot;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String flyPlane(Flight flight){
        return "Welcome to flight " + flight.getFlightNumber() + " from " + flight.getDepartedFrom() + " to " + flight.getDestination();
    }
}

