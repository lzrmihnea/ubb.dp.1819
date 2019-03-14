package ro.ubb.dp1819.exercises.entity;

import java.util.Objects;

public class Cappuccino extends Coffee implements Drinkable {

    private Ingredient milk;

    private Cappuccino(Ingredient water, Ingredient coffeeBeans, Ingredient milk) {
        super(water, coffeeBeans);
        this.milk = milk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        final Cappuccino that = (Cappuccino) o;
        return Objects.equals(water, that.water) &&
                Objects.equals(coffeeBeans, that.coffeeBeans) &&
                Objects.equals(milk, that.milk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, coffeeBeans, milk);
    }

    public static CappuccinoBuilder builder() {
        return new CappuccinoBuilder();
    }

    public static class CappuccinoBuilder {

        private Ingredient water;
        private Ingredient coffeeBeans;
        private Ingredient milk;

        private CappuccinoBuilder() {}

        public CappuccinoBuilder water(Ingredient water) {
            this.water = water;
            return this;
        }

        public CappuccinoBuilder coffeeBeans(Ingredient coffeeBeans) {
            this.coffeeBeans = coffeeBeans;
            return this;
        }

        public CappuccinoBuilder milk(Ingredient milk) {
            this.milk = milk;
            return this;
        }

        public Cappuccino build() {
            return new Cappuccino(water, coffeeBeans, milk);
        }

    }

}
