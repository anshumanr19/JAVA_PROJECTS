package spark_batch.basic_projects.findmytrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationNumber;
    private String stationName;
    private List<Platform> platformList;

    public Station(String stationNumber, String stationName) {
        this.stationNumber = stationNumber;
        this.stationName = stationName;
        this.platformList = new ArrayList<>();
    }

    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationNumber='" + stationNumber + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
