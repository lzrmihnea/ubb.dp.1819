package ro.ubb.dp1819.exercises.entity;

import java.util.Objects;

public class Coffee {

    protected Ingredient water;
    protected Ingredient coffeeBeans;

    protected Coffee(Ingredient water, Ingredient coffeeBeans) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        final Coffee coffee = (Coffee) o;
        return Objects.equals(water, coffee.water) &&
                Objects.equals(coffeeBeans, coffee.coffeeBeans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, coffeeBeans);
    }
}
