package stream.world;

import java.math.BigDecimal;
import java.util.HashSet;

public class World {

    private HashSet<Continent> listOfContinent = new HashSet<Continent>();

    public void addContinent(Continent continent) {
        listOfContinent.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal allThePeopleOnTheWorld = listOfContinent.stream()
                .flatMap(continent -> continent.getCountryListOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (allPeople, currentCountryPeopleQuantity) -> allPeople = allPeople.add(currentCountryPeopleQuantity));
        return allThePeopleOnTheWorld;
    }

}
