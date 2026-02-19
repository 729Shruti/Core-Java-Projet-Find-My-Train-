import java.util.List;
public class Schedule {
    private Train train;
    List<ScheduleStop>stops;

    public Schedule(Train train, List<ScheduleStop> stops) {
        this.train = train;
        this.stops = stops;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public List<ScheduleStop> getStops() {
        return stops;
    }

    public void setStops(List<ScheduleStop> stops) {
        this.stops = stops;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", stops=" + stops +
                '}';
    }
}
