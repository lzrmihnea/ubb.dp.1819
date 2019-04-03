package ro.ubb.dp1819.lab1.exercises.entity;

public class Espresso extends Coffee implements Drinkable {

    private Espresso(Ingredient water, Ingredient coffeeBeans) {
        super(water, coffeeBeans);
    }

    public static EspressoBuilder builder() {
        return new EspressoBuilder();
    }

    public static class EspressoBuilder {

        private Ingredient water;
        private Ingredient coffeeBeans;

        private EspressoBuilder() {
        }

        public EspressoBuilder water(Ingredient water) {
            this.water = water;
            return this;
        }

        public EspressoBuilder coffeeBeans(Ingredient coffeeBeans) {
            this.coffeeBeans = coffeeBeans;
            return this;
        }

        public Espresso build() {
            return new Espresso(water, coffeeBeans);
        }

    }

}
