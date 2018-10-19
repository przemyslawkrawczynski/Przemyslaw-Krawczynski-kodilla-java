package stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Continent {
    private String continentName;
    HashSet<Country> countryListOnContinent = new HashSet<Country>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
    public void addCountry(Country country) {
        countryListOnContinent.add(country);
    }

    public HashSet<Country> getCountryListOnContinent() {
        return countryListOnContinent;
    }

    public Set<BigDecimal> getPeopleQuantityOnContinent() {
        return countryListOnContinent.stream()
                .map(country -> country.getPeopleQuantity())
                .collect(Collectors.toSet());
    }
}
