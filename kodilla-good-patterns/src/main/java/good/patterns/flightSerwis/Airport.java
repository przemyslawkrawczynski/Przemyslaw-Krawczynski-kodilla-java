package good.patterns.flightSerwis;

import java.time.LocalTime;
import java.util.ArrayList;
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

    public void searchFlightToCity(String city) {
        for (Map.Entry<String, ArrayList<LocalTime>> entry : cityDepartureList.getCityFlightList().entrySet()) {
            if(entry.getKey().equals(city)) {
                System.out.println("Loty do " + city + " z lotniska " + getAirportName() + " dostępne są w godzinach " + entry.getValue());
            }
        }
    }
}
