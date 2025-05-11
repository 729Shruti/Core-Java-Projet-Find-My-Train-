import java.util.ArrayList;
import java.util.List;

public class Station {
    private String Station_id;
    private String Station_name;
    private List<Platform> platformList;

    public Station(String staion_id, String station_name) {
        this.Station_id = staion_id;
        this.Station_name = station_name;
        this.platformList=new ArrayList<>();
    }

    public String getStation_id() {
        return Station_id;
    }

    public void setStation_id(String staion_id) {
        Station_id = Station_id;
    }

    public String getStation_name() {
        return Station_name;
    }

    public void setStation_name(String station_name) {
        Station_name = station_name;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }
}
