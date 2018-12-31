package patterns.builder.bun;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {

    public List<String> basicIngredientsList() {
        List<String> basicIngredientsList = new ArrayList<>();
        basicIngredientsList.add("Onion");
        basicIngredientsList.add("Tomato");
        basicIngredientsList.add("Cheese");
        basicIngredientsList.add("Salad");
        basicIngredientsList.add("Spices");
        return basicIngredientsList;
    }

    public boolean checkIngredient(String ingredient) {
        List<String> ingredientList = basicIngredientsList();
        ingredientList.add("Pepperoni");
        ingredientList.add("Mushrooms");
        ingredientList.add("Becon");
        ingredientList.add("Shrimp");
        ingredientList.add("Extra Cheese");
        return ingredientList.contains(ingredient);
    }
}
