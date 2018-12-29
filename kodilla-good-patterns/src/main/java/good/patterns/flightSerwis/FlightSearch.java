package good.patterns.flightSerwis;
import java.util.ArrayList;

public class FlightSearch {

    public static void main(String args[]) {

        GenerateData gd = new GenerateData();
        ArrayList<Airport> cdl = gd.generateFlightData();

        // FlightList City

        System.out.println("Lista lotów z Krakowa:");

        cdl.stream()
                .filter(e -> e.getAirportName().equals("Kraków"))
                .flatMap(e -> e.getCityDepartureList().getCityFlightList().entrySet().stream())
                .map(e -> new String("Miasto docelowe:"+ e.getKey() + " | godziny " + e.getValue() ))
                .forEach(System.out::println);

        // All Flights to Wrocław from all Airports

        System.out.println();
        System.out.println("Wszystkie loty do Wrocławia z innych lotnisk.");

        cdl.stream()
                .forEach(e -> e.searchFlightToCity("Wrocław"));


        //All Flight to Wrocław from Kraków

        System.out.println();
        System.out.println("Wszystkie loty do Wrocławia z Krakowa");
        cdl.stream()
                .filter(e -> e.getAirportName().equals("Kraków"))
                .forEach(e -> e.searchFlightToCity("Wrocław"));

        // Transit

        System.out.println();
        System.out.println("Lista lotów z Krakowa do Warszawy przez Wrocław:");

        cdl.stream()
                .filter(e -> e.getAirportName().equals("Kraków") || e.getAirportName().equals("Wrocław"))
                .forEach(e -> e.getCityDepartureList().getDestinationFlightList(e.getCityDepartureList(), "Wrocław", "Warsaw"));
        }
}
