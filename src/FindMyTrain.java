import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindMyTrain {
  public static void main(String args[]) {
    TrainSystem trainSystem = new TrainSystem();
    Train train1 = new Train("T1234", "ChennaiExpress", "Seater");
    Train train2 = new Train("T5678", "MumbaiExpress", "Seater");
    Train train3 = new Train("T1357", "DelhiExpress", "Sleeper");


    Station station1 = new Station("S0012", "PuneStation");
    Station station2 = new Station("S0013", "MumbaiCentral");
    Station station3 = new Station("S0014", "DelhiStation");

    Platform p1 = new Platform("1");
    Platform p2 = new Platform("2");
    Platform p3 = new Platform("3");

    p1.setTrain(train1);
    p2.setTrain(train2);
    p3.setTrain(train3);


    List<Platform> platformList=new ArrayList<>();
    platformList.add(p1);
    platformList.add(p2);
    platformList.add(p3);

    Schedule schedule1=new Schedule("8:00","8:30",train1,p1,station2);
    Schedule schedule2=new Schedule("8:00","8:30",train1,p2,station1);



    trainSystem.addTrain(train1);
    trainSystem.addTrain(train2);
    trainSystem.addTrain(train3);

    trainSystem.addStations(station1);
    trainSystem.addStations(station2);
    trainSystem.addStations(station3);

    trainSystem.addSchedule(schedule1);
    trainSystem.addSchedule(schedule2);

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Source:");
    String src=sc.nextLine();
    System.out.print("Enter Destination:");
    String des=sc.nextLine();

    List<Schedule> trains=trainSystem.findMyTrains(src,des);

    System.out.println("The schedule between "+src+" and "+des+" are:");
    for(Schedule schedule:trains){
      System.out.println(schedule);
    }


  }

}
