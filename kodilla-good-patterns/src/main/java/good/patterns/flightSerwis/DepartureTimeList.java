package good.patterns.flightSerwis;

import java.time.LocalTime;
import java.util.ArrayList;

public class DepartureTimeList {

    public ArrayList<LocalTime> generateDepartureList(LocalTime localTime) {

        ArrayList<LocalTime> dl = new ArrayList<>();

        dl.add(localTime);
        dl.add(localTime.plusHours(3).plusMinutes(20));
        dl.add(localTime.plusHours(6).plusMinutes(40));
        dl.add(localTime.plusHours(9).plusMinutes(50));

        return dl;
    }
}
