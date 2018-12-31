package patterns.builder.bun;

import java.util.ArrayList;
import java.util.List;

public class Sauce {

    private List<String> sauceList = new ArrayList<>();

    public Sauce() {
        sauceList.add("1000 Islands");
        sauceList.add("Standard");
        sauceList.add("Barbecue");
    }

    public boolean checkSouceList(String sauce) {
        return sauceList.contains(sauce);
    }
}
