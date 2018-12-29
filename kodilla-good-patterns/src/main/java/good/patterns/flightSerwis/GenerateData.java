package good.patterns.flightSerwis;

import java.time.LocalTime;
import java.util.ArrayList;

public class GenerateData {

    public ArrayList<Airport> generateFlightData() {

        ArrayList<Airport> airports = new ArrayList<>();

        CityDepartureList cracow = new CityDepartureList("Kraków");
        CityDepartureList warsaw = new CityDepartureList("Warsaw");
        CityDepartureList wroclaw = new CityDepartureList("Wrocław");
        CityDepartureList gdansk = new CityDepartureList("Gdańsk");

        DepartureTimeList dtl = new DepartureTimeList();

        cracow.addDestination("Warsaw", dtl.generateDepartureList(LocalTime.of(5,05)));
        cracow.addDestination("Gdańsk", dtl.generateDepartureList(LocalTime.of(6,10)));
        cracow.addDestination("Wrocław", dtl.generateDepartureList(LocalTime.of(7,15)));

        warsaw.addDestination("Krakow", dtl.generateDepartureList(LocalTime.of(5,00)));
        warsaw.addDestination("Gdańsk", dtl.generateDepartureList(LocalTime.of(6,15)));
        warsaw.addDestination("Wrocław", dtl.generateDepartureList(LocalTime.of(6,20)));

        gdansk.addDestination("Warsaw", dtl.generateDepartureList(LocalTime.of(5,05)));
        gdansk.addDestination("Krakow", dtl.generateDepartureList(LocalTime.of(6,10)));
        gdansk.addDestination("Wrocław", dtl.generateDepartureList(LocalTime.of(6,10)));

        wroclaw.addDestination("Krakow", dtl.generateDepartureList(LocalTime.of(7,00)));
        wroclaw.addDestination("Gdańsk", dtl.generateDepartureList(LocalTime.of(8,15)));
        wroclaw.addDestination("Warsaw", dtl.generateDepartureList(LocalTime.of(9,20)));


        Airport cracowAirport = new Airport("Kraków", cracow);
        Airport warsawAirport = new Airport("Warsaw", warsaw);
        Airport wroclawAirport = new Airport("Wrocław", wroclaw);
        Airport gdanskAirport = new Airport("Gdańsk", gdansk);

        airports.add(cracowAirport);
        airports.add(warsawAirport);
        airports.add(wroclawAirport);
        airports.add(gdanskAirport);

        return airports;
    }


}
