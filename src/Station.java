

public class Station {
    private String StationId;
    private String StationName;


    public Station(String stationId, String stationName) {
        StationId = stationId;
        StationName = stationName;
    }

    public String getStationId() {
        return StationId;
    }

    public void setStationId(String stationId) {
        StationId = stationId;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "StationId='" + StationId + '\'' +
                ", StationName='" + StationName + '\'' +
                '}';
    }
}
