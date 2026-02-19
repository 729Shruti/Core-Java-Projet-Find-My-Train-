import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindMyTrain {
  public static void main(String args[]) {

    TrainSystem trainSystem = new TrainSystem();


    Train ChennaiExpress = new Train("T1234", "ChennaiExpress", "Seater");
    Train MumbaiExpress = new Train("T5678", "MumbaiExpress", "Seater");
    Train DelhiExpress = new Train("T1357", "DelhiExpress", "Sleeper");

    Station PuneStation = new Station("S0012", "PuneStation");
    Station MumbaiCentral = new Station("S0013", "MumbaiCentral");
    Station DelhiStation = new Station("S0014", "DelhiStation");

    Platform p1 = new Platform("1");
    Platform p2 = new Platform("2");



    Schedule s1 = new Schedule(DelhiExpress, List.of(
            new ScheduleStop(
                    null,
                    LocalDateTime.of(2025, 2, 1, 6, 0),
                    MumbaiCentral,
                    p1,
                    1
            ),
            new ScheduleStop(
                    LocalDateTime.of(2025, 2, 1, 7, 0),
                    LocalDateTime.of(2025, 2, 1, 7, 5),
                    PuneStation,
                    p2,
                    2
            ),
            new ScheduleStop(
                    LocalDateTime.of(2025, 2, 1, 9, 0),
                    null,
                    DelhiStation,
                    p1,
                    3
            )
    ));



    trainSystem.addTrain(ChennaiExpress);
    trainSystem.addTrain(MumbaiExpress);
    trainSystem.addTrain(DelhiExpress);

    trainSystem.addStations(PuneStation);
    trainSystem.addStations(MumbaiCentral);
    trainSystem.addStations(DelhiStation);

    trainSystem.addPlatforms(p1);
    trainSystem.addPlatforms(p2);

    trainSystem.addSchedule(s1);


    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Source:");
    String src=sc.nextLine();
    System.out.print("Enter Destination:");
    String des=sc.nextLine();

    List<Schedule> trains=trainSystem.findMyTrains(src,des);

    System.out.println("The schedule between "+src+" and "+des+" are:");
    if (trains.isEmpty()){
      System.out.println(
              "No train available"
      );
    }
    else{
      for(Schedule schedule:trains){
        System.out.println(schedule);
      }
    }


  }

}
