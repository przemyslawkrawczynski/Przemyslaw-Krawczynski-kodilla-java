package good.patterns.flightSerwis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightQuery {

    // FlightList City

    public List<String>  flightsFromCity(String city, List<Airport> airportList) {

        System.out.println("Lista lotów z ->" + city);

        List<String> flightList = airportList.stream()
                .filter(e -> e.getAirportName().equals(city))
                .flatMap(e -> e.getCityDepartureList().getCityFlightList().entrySet().stream())
                .map(e -> new String("Miasto docelowe:" + e.getKey() + " | godziny " + e.getValue()))
                .collect(Collectors.toList());

        return flightList;
    }

    // All Flights to Wrocław from all Airports

    public List<String> flightsToCity(String city, List<Airport> airportList) {

        System.out.println("Wszystkie loty do " + city + " z innych lotnisk.");

        List<String> flightList = airportList.stream()
                .flatMap(e -> e.searchFlightToCity(city).stream())
                .collect(Collectors.toList());

        return flightList;
    }


    public List<String> flightsFromCityToCity(String airport, String destiny, List<Airport> airportList) {

        System.out.println("Wszystkie loty do " + destiny + " z " + airport);
        List<String> flightList = airportList.stream()
                .filter(e -> e.getAirportName().equals(airport))
                .flatMap(e -> e.searchFlightToCity(destiny).stream())
                .collect(Collectors.toList());
        return flightList;
    }

    public void flightToCityByCity(String airport, String destination, String interchangeCity, List<Airport> airportList){
    // Transit

        System.out.println();
        System.out.println("Lista lotów z " + airport + " do " + destination + " przez " + interchangeCity);

        airportList.stream()
                .filter(e -> e.getAirportName().equals(airport) || e.getAirportName().equals(destination))
            .forEach(e -> e.getCityDepartureList().getDestinationFlightList(e.getCityDepartureList(), interchangeCity, destination));
    }
}
