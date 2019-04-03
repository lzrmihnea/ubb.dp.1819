package ro.ubb.dp1819.lab1.exercises.entity;

public class Americano extends Coffee implements Drinkable {

    private Americano(Ingredient water, Ingredient coffeeBeans) {
        super(water, coffeeBeans);
    }

    public static AmericanoBuilder builder() {
        return new AmericanoBuilder();
    }

    public static class AmericanoBuilder {

        private Ingredient water;
        private Ingredient coffeeBeans;

        private AmericanoBuilder() {
        }

        public AmericanoBuilder water(Ingredient water) {
            this.water = water;
            return this;
        }

        public AmericanoBuilder coffeeBeans(Ingredient coffeeBeans) {
            this.coffeeBeans = coffeeBeans;
            return this;
        }

        public Americano build() {
            return new Americano(water, coffeeBeans);
        }

    }
}
