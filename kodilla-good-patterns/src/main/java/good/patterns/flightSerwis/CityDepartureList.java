package good.patterns.flightSerwis;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CityDepartureList {

    private String city;
    private HashMap<String, ArrayList<LocalTime>> cityFlightList = new HashMap<>();

    public CityDepartureList(String city) {
        this.city = city;
    }

    public void addDestination(String destinationCity, ArrayList<LocalTime> departureTimes) {
        cityFlightList.put(destinationCity, departureTimes);
    }

    public void getDestinationFlightList(CityDepartureList cityDepartureList, String transitCity, String cityDestination) {

        if (cityDepartureList.getCity().equals(city)) {
            for (Map.Entry<String, ArrayList<LocalTime>> entry : cityDepartureList.getCityFlightList().entrySet()) {
                if (entry.getKey().equals(transitCity)) {
                    System.out.println("Połączenia z " + city + " do " + transitCity + " -> " + entry.getValue());
                }
            }
        }

        if (cityDepartureList.getCity().equals(transitCity)) {
               for (Map.Entry<String, ArrayList<LocalTime>> entry : cityDepartureList.getCityFlightList().entrySet()) {
                    if (entry.getKey().equals(cityDestination)) {
                        System.out.println("Możliwe przesiadki w " + transitCity + " do " + cityDestination + " -> " + entry.getValue());
                    }
                }
            }

        }


        public String getCity() {
            return city;
        }

        public HashMap<String, ArrayList<LocalTime>> getCityFlightList () {
            return cityFlightList;
        }

}
