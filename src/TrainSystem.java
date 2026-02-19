import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
     private Map<String,Station> stations=new HashMap<>();
     private Map<String,Train> trains=new HashMap<>();
     private Map<String,Platform> platforms=new HashMap<>();
     private List<Schedule> schedules =new ArrayList<>();

     public void addStations(Station  station){
          stations.put(station.getStationId(),station);
     }
     public void addPlatforms(Platform  platform){
          platforms.put(platform.getPlatformNo(),platform);
     }
     public void addTrain(Train train){
          trains.put(train.getTrainId(), train);
     }

     public void addSchedule(Schedule schedule){
          schedules.add(schedule);
     }

     public List<Schedule> findMyTrains(String src,String des){
          List<Schedule> result=new ArrayList<>();

          for(Schedule schedule:schedules){
               if (schedule.getSrcStation().getStationName().equals(src) && schedule.getEndStation().getStationName().equals(des)) {
                    result.add(schedule);
               }
          }
          return result;
     }













}
