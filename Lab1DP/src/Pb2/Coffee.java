package Pb2;

import Pb1.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
    public abstract String getName();
    public abstract List<Ingredient> getIngredients();

    @Override
    public String toString() {
        String toShow = getName();

        for(Ingredient i:getIngredients()){
            toShow += " " + i.toString() + "\n";
        }

        return toShow;
    }

    public static class CoffeeBuilder {
        private String name;
        private List<Ingredient> ingredients;

        public CoffeeBuilder(String name) {
            this.name = name;
            this.ingredients = new ArrayList<>();
        }

        public CoffeeBuilder setIngredients(List<Ingredient> ingredients) {
            this.ingredients = ingredients;

            return this;
        }

        public String getName() {
            return name;
        }

        public List<Ingredient> getIngredients() {
            return ingredients;
        }

        public Coffee build() throws Exception {
            switch(name) {
                case "espresso":
                    return new Espresso(this);
                case "cappuccino":
                    return new Cappuccino(this);
                case "americano":
                    return new Americano(this);
                case "latte macchiato":
                    return new LatteMacchiato(this);
                    default:
                        throw new Exception("This type of coffee doesn't exist!");
            }
        }
    }
}
