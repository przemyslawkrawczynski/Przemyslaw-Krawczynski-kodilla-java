package good.patterns.flightSerwis;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Airport {
    private String airportName;
    private CityDepartureList cityDepartureList;

    public Airport(String airportName, CityDepartureList cityDepartureList) {
        this.airportName = airportName;
        this.cityDepartureList = cityDepartureList;
    }

    public String getAirportName() {
        return airportName;
    }

    public CityDepartureList getCityDepartureList() {
        return cityDepartureList;
    }

    public List<String> searchFlightToCity(String city) {

        List<String> flightList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<LocalTime>> entry : cityDepartureList.getCityFlightList().entrySet()) {
            if(entry.getKey().equals(city)) {
                String flight = "Loty do " + city + " z lotniska " + getAirportName() + " dostępne są w godzinach " + entry.getValue();
                flightList.add(flight);
            }
        }
        return flightList;
    }
}
