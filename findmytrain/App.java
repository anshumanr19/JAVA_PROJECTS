package spark_batch.basic_projects.findmytrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TrainSystem trainSystem = new TrainSystem();

        //  ADDING NEW STATION
        Station station1 = new Station("ST01", "Agra");
        Station station2 = new Station("ST02", "Lucknow");

        //  ADDING NEW TRAIN
        Train train1 = new Train("12345", "Agra->Lucknow", "Passanger");
        Train train2 = new Train("12333", "BBSR->BLR", "Malgadi");

        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);

        platform1.setTrain(train1);
        platform2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);

        station1.setPlatformList(platformList);

        Schedule schedule1 = new Schedule(train1, station1, "9AM", "9.05AM", platform1);
        Schedule schedule2 = new Schedule(train2, station2, "10AM", "10:10AM", platform2);

        trainSystem.addStation(station1);
        trainSystem.addStation(station2);
        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);
        trainSystem.addSchedule(schedule1);
        trainSystem.addSchedule(schedule2);

        //  LET'S FIND TRAIN BETWEEN STATIONS
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the source: ");
        String source = in.next();

        System.out.println("Enter the destination: ");
        String destination = in.next();

        List<Schedule> myTrains = trainSystem.findMyTrain(source, destination);
//        Schedule schedule = myTrains.get(0);
//        Train train = schedule.getTrain();
        System.out.println("Your trains are: " + myTrains.get(0));

    }
}
