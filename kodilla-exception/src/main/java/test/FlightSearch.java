package test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {


        HashMap<String, Boolean> departureAirportMap = new HashMap<String, Boolean>();

        departureAirportMap.put("Amsterdam", true);
        departureAirportMap.put("Berlin", true);
        departureAirportMap.put("Paris", true);
        departureAirportMap.put("Rome", true);
        departureAirportMap.put("Moscow", true);

        if(departureAirportMap.keySet().contains(flight.getDepartureAirport()) && departureAirportMap.get(flight.getDepartureAirport())) {
                System.out.println("You can flight to " + flight.getDepartureAirport() + " from " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
