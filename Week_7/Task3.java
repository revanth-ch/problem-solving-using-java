package Week_7;

import java.util.*;

public class Task3 {

    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Travel {
        int totalTime;
        int count;

        Travel(int totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    private Map<Integer, CheckIn> checkIns;
    private Map<String, Travel> travels;

    public Task3() {
        checkIns = new HashMap<>();
        travels = new HashMap<>();
    }

    public void checkIn(
            int id,
            String stationName,
            int t) {

        checkIns.put(
            id,
            new CheckIn(stationName, t)
        );
    }

    public void checkOut(
            int id,
            String stationName,
            int t) {

        CheckIn start = checkIns.get(id);

        int travelTime = t - start.time;

        String key =
            start.station + "->" + stationName;

        if (!travels.containsKey(key)) {

            travels.put(
                key,
                new Travel(travelTime, 1)
            );

        } else {

            Travel travel = travels.get(key);

            travel.totalTime += travelTime;
            travel.count++;
        }

        checkIns.remove(id);
    }

    public double getAverageTime(
            String startStation,
            String endStation) {

        String key =
            startStation + "->" + endStation;

        Travel travel = travels.get(key);

        return (double) travel.totalTime /
               travel.count;
    }
}