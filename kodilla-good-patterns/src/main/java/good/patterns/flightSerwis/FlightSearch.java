package good.patterns.flightSerwis;
import java.util.List;

public class FlightSearch {

    public static void main(String args[]) {

        GenerateData gd = new GenerateData();
        List<Airport> cdl = gd.generateFlightData();
        FlightQuery flightQuery = new FlightQuery();

        flightQuery.flightsFromCity("Kraków", cdl).stream()
                .forEach(System.out::println);

        flightQuery.flightsToCity("Wrocław",cdl).stream()
                .forEach(System.out::println);

        flightQuery.flightsFromCityToCity("Kraków", "Warsaw", cdl).stream()
                .forEach(System.out::println);

        flightQuery.flightToCityByCity("Kraków", "Gdańsk", "Wrocław",cdl );

    }
}
