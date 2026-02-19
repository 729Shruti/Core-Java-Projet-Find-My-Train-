import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
     private Map<String,Station> stations=new HashMap<>();

     public void addStations(Station  station) {
          stations.put(station.getStationId(), station);
     }

     private Map<String,Train> trains=new HashMap<>();
     public void addTrain(Train train){
          trains.put(train.getTrainId(), train);
     }

     private Map<String,Platform> platforms=new HashMap<>();
     public void addPlatforms(Platform  platform){
          platforms.put(platform.getPlatformNo(),platform);
     }

     private List<Schedule> schedules = new ArrayList<>();

     public void addSchedule(Schedule schedule) {
          schedules.add(schedule);
     }

     public List<Schedule> findMyTrains(String src, String dest) {

          List<Schedule> result = new ArrayList<>();

          for (Schedule schedule : schedules) {

               int srcIndex = -1;
               int destIndex = -1;

               List<ScheduleStop> stops = schedule.getStops();

               for (int i = 0; i < stops.size(); i++) {
                    if (stops.get(i).getStation().getStationName().equalsIgnoreCase(src)) {
                         srcIndex = i;
                    }
                    if (stops.get(i).getStation().getStationName().equalsIgnoreCase(dest)) {
                         destIndex = i;
                    }
               }

               if (srcIndex != -1 && destIndex != -1 && srcIndex < destIndex) {
                    result.add(schedule);
               }
          }

          return result;
     }















}
