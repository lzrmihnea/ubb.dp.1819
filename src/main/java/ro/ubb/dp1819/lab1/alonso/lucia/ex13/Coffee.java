package ro.ubb.dp1819.lab1.alonso.lucia.ex13;


public class Coffee {

    private String name;
    String[] ingredients = new String[3];

    public Coffee(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Coffee: " + ingredients[0] + " + " +  ingredients[1] + " + " +  ingredients[2] ;
    }

    public static class CoffeeBuilder {

        private String[] ingredients = new String[3];

        public CoffeeBuilder() {
        }

        public CoffeeBuilder addIngredient1(String ingredient) {
            this.ingredients[0] = ingredient;
            return this;
        }

        public CoffeeBuilder addIngredient2(String ingredient) {
            this.ingredients[1] = ingredient;
            return this;
        }

        public CoffeeBuilder addIngredient3(String ingredient) {
            this.ingredients[2] = ingredient;
            return this;
        }

        public Coffee create() {
            String[] coffee = ingredients;
            return new Coffee(coffee);
        }

    }

}

