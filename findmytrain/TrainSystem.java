package spark_batch.basic_projects.findmytrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String, Station> stations = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStation(Station station) {
        stations.put(station.getStationNumber(), station);
    }

    public void addTrain(Train train) {
        trains.put(train.getTrainNumber(), train);
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public List<Schedule> findMyTrain(String startStationName, String endStationName) {
        List<Schedule> result = new ArrayList<>();

        for (Schedule schedule : schedules) {
            if (schedule.getStation().getStationName().equals(startStationName) || schedule.getStation().getStationName().equals(endStationName)) {
                result.add(schedule);
            }
        }
        return result;
    }
}
