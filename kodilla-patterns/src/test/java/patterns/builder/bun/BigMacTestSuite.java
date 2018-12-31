package patterns.builder.bun;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void correctBigMacCreator() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Width Sezam")
                .burgers(1)
                .souce("Spicy")
                .ingredients("Extra Cheese")
                .ingredients("Becon")
                .build();

        bigMac.showBurger();

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(7, howManyIngredients);
    }
}
