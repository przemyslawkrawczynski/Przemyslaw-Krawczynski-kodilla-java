package test;

public class FlightMain {
    public static void main (String[] args) {

        Flight flight = new Flight("Paris", "Warsaw");
        FlightSearch search = new FlightSearch();

        try {

            search.findFlight(flight);

        } catch (RouteNotFoundException e) {

            System.out.println("You can`t flight from " + flight.getArrivalAirport() + " to " + flight.getDepartureAirport());
        }
    }
}
