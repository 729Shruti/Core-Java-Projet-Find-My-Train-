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

    Schedule schedule1=new Schedule("8:00","5:30",DelhiExpress,p1,p1,MumbaiCentral,DelhiStation);
    Schedule schedule2=new Schedule("5:00","7:30",MumbaiExpress,p1,p2,PuneStation,MumbaiCentral);
    Schedule schedule3=new Schedule("6:00","3:30",DelhiExpress,p1,p1,MumbaiCentral,DelhiStation);
    Schedule schedule4=new Schedule("9:00","11:30",MumbaiExpress,p1,p2,PuneStation,MumbaiCentral);


    trainSystem.addTrain(ChennaiExpress);
    trainSystem.addTrain(MumbaiExpress);
    trainSystem.addTrain(DelhiExpress);

    trainSystem.addStations(PuneStation);
    trainSystem.addStations(MumbaiCentral);
    trainSystem.addStations(DelhiStation);

    trainSystem.addPlatforms(p1);
    trainSystem.addPlatforms(p2);

    trainSystem.addSchedule(schedule1);
    trainSystem.addSchedule(schedule2);
    trainSystem.addSchedule(schedule3);
    trainSystem.addSchedule(schedule4);

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
