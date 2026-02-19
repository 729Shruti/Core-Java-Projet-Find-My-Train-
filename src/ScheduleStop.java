import java.time.LocalDateTime;

public class ScheduleStop {
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private Station station;
    private Platform platform;
    private int stopOrder;

    public ScheduleStop(LocalDateTime arrivalTime, LocalDateTime departureTime, Station station, Platform platform, int stopOrder) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.station = station;
        this.platform = platform;
        this.stopOrder = stopOrder;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        platform = platform;
    }

    public int getStopOrder() {
        return stopOrder;
    }

    public void setStopOrder(int stopOrder) {
        this.stopOrder = stopOrder;
    }

    @Override
    public String toString() {
        return "ScheduleStop{" +
                "arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", station=" + station +
                ", Platform=" + platform +
                ", stopOrder=" + stopOrder +
                '}';
    }

}
