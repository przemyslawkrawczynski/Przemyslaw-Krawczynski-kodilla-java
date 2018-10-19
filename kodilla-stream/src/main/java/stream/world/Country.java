package stream.world;


import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) &&
                Objects.equals(peopleQuantity, country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, peopleQuantity);
    }
}
