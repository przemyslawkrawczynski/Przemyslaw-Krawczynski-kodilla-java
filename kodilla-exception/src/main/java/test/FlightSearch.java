package test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Boolean findFlight = false;
        HashMap<String, Boolean> departureAirportMap = new HashMap<String, Boolean>();

        departureAirportMap.put("Amsterdam", true);
        departureAirportMap.put("Berlin", true);
        departureAirportMap.put("Paris", true);
        departureAirportMap.put("Rome", true);
        departureAirportMap.put("Moscow", true);

        for(Map.Entry<String, Boolean> entry :departureAirportMap.entrySet()){

            if(entry.getKey().equals(flight.getDepartureAirport())) {
                System.out.println("You can flight to " + flight.getDepartureAirport() + " from " + flight.getArrivalAirport());
                findFlight = true;
            }
        }

        if(!findFlight) { throw new RouteNotFoundException(); }

    }
}
