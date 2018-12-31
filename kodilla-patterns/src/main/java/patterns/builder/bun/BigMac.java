package patterns.builder.bun;
import java.util.List;
import java.util.stream.Collectors;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private Ingredients ingredients = new Ingredients();
        private Sauce sauceList = new Sauce();
        private List<String> ingredientsList = ingredients.basicIngredientsList();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int numbers) {
            if (numbers > 0) {
                this.burgers = numbers;
                return this;
            } else {
                throw new IllegalStateException("Number of burgers must by bigger than 0.");
            }
        }

        public BigMacBuilder sauce(String sauce) {
            if (sauceList.checkSouceList(sauce)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("You can use only Barbeque, Standard or 1000 Island souce.");
            }
        }

        public BigMacBuilder ingredients(String ingriedient) {

            if (ingredients.checkIngredient(ingriedient)) {
                ingredientsList.add(ingriedient);
                return this;
            } else {
                throw new IllegalStateException("You can`t add " + ingriedient + " to your BigMac");
            }
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredientsList);
        }
    }

    private BigMac(final String bun, final int burgers,final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public void showBurger() {
        System.out.println("BicMac");
        System.out.println("Bun - " + bun);
        System.out.println("Burgers - " + burgers);

        String finalIngriedients = ingredients.stream()
                .collect(Collectors.joining(", ","",""));
        System.out.println("Ingriedients: " + finalIngriedients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSouce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}


