public abstract class Staff extends Person {

    protected CabinCrewRank rank;

    public Staff(String name, CabinCrewRank rank) {
        super(name);
        this.rank = rank;
    }

    public CabinCrewRank getRank() {
        return rank;
    }

    public void setRank(CabinCrewRank rank) {
        this.rank = rank;
    }
}
