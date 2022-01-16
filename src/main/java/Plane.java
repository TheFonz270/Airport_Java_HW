public class Plane {

    protected PlaneType planeType;
    protected int capacity;
    protected int totalWeight;

    public Plane(PlaneType planeType){
        this.planeType = planeType;

        switch(planeType) {
            case BOEING747:
                this.capacity = 747;
                this.totalWeight = 7747;
                break;
            case CONCORD:
                this.capacity = 500;
                this.totalWeight = 6000;
                break;
            case VESPA:
                this.capacity = 10;
                this.totalWeight = 1000;
                break;
        }
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
