public class Schedule {
    private String arrivalTime;
    private String departureTime;
    private Train train;
    private Platform platform;
    private Station station;

    public Schedule(String arrivalTime, String departureTime, Train train, Platform platform, Station station) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.train = train;
        this.platform = platform;
        this.station = station;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", train=" + train +
                ", platform=" + platform +
                ", station=" + station +
                '}';
    }
}
