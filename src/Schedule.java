public class Schedule {
    private String arrivalTime;
    private String reachingTime;
    private Train train;
    private Platform srcPlatform;
    private Platform endPlatform;
    private Station srcStation;
    private Station endStation;

    public Schedule(String arrivalTime, String reachingTime, Train train, Platform srcPlatform, Platform endPlatform, Station srcStation, Station endStation) {
        this.arrivalTime = arrivalTime;
        this.reachingTime = reachingTime;
        this.train = train;
        this.srcPlatform = srcPlatform;
        this.endPlatform = endPlatform;
        this.srcStation = srcStation;
        this.endStation = endStation;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getReachingTime() {
        return reachingTime;
    }

    public void setReachingTime(String reachingTime) {
        this.reachingTime = reachingTime;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Platform getSrcPlatform() {
        return srcPlatform;
    }

    public void setSrcPlatform(Platform srcPlatform) {
        this.srcPlatform = srcPlatform;
    }

    public Platform getEndPlatform() {
        return endPlatform;
    }

    public void setEndPlatform(Platform endPlatform) {
        this.endPlatform = endPlatform;
    }

    public Station getSrcStation() {
        return srcStation;
    }

    public void setSrcStation(Station srcStation) {
        this.srcStation = srcStation;
    }

    public Station getEndStation() {
        return endStation;
    }

    public void setEndStation(Station endStation) {
        this.endStation = endStation;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "arrivalTime='" + arrivalTime + '\'' +
                ", reachingTime='" + reachingTime + '\'' +
                ", train=" + train +
                ", srcPlatform=" + srcPlatform +
                ", endPlatform=" + endPlatform +
                ", srcStation=" + srcStation +
                ", endStation=" + endStation +
                '}';
    }
}
