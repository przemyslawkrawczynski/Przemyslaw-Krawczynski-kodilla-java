package patterns.builder.bun;

import java.util.ArrayList;
import java.util.List;

public class BasicIngredients {

    public List<String> basicIngredientsList() {
        List<String> basicIngredientsList = new ArrayList<>();
        basicIngredientsList.add("Onion");
        basicIngredientsList.add("Tomato");
        basicIngredientsList.add("Cheese");
        basicIngredientsList.add("Salad");
        basicIngredientsList.add("Spices");
        return basicIngredientsList;
    }
}
