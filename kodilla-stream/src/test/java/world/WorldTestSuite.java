package world;

import org.junit.Assert;
import org.junit.Test;
import stream.world.Continent;
import stream.world.Country;
import stream.world.World;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
       //Given

        // Europe
        Country polska = new Country("Polska", new BigDecimal("45000000"));
        Country niemcy = new Country("Niemcy", new BigDecimal("90000000"));
        Country wlochy = new Country("Włochy", new BigDecimal("65000000"));
        Country czechy = new Country("Czechy", new BigDecimal("19000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(polska);
        europe.addCountry(niemcy);
        europe.addCountry(wlochy);
        europe.addCountry(czechy);

        // America
        Country usa = new Country("USA", new BigDecimal("300000000"));
        Country canada = new Country("Canada", new BigDecimal("150000000"));
        Country mexico = new Country("Mexico", new BigDecimal("15000000"));
        Country brazil = new Country("Brazil", new BigDecimal("150000000"));

        Continent america = new Continent("America");
        america.addCountry(usa);
        america.addCountry(canada);
        america.addCountry(mexico);
        america.addCountry(brazil);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(america);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("834000000");
        Assert.assertEquals(expectedResult, result);
    }

}
