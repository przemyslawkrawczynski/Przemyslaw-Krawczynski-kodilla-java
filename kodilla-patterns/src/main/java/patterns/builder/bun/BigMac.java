package patterns.builder.bun;
import java.util.List;
import java.util.stream.Collectors;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String souce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String souce;
        private List<String> ingredients = new BasicIngredients().basicIngredientsList();

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

        public BigMacBuilder souce(String souce) {
            this.souce = souce;
            return this;
        }

        public BigMacBuilder ingredients(String ingriedient) {
            ingredients.add(ingriedient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, souce, ingredients);
        }
    }

    private BigMac(final String bun, final int burgers,final String souce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.souce = souce;
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
        return souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}


