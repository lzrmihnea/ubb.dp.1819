package ro.ubb.dp1819.panaite.dorinel.ex2;

import ro.ubb.dp1819.panaite.dorinel.ex1.BaseCoffeeIngredients;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

import java.util.Arrays;
import java.util.Objects;

public class CompoundCoffeeIngredients extends BaseCoffeeIngredients {
    private BaseCoffeeIngredients firstCoffeeIngredients;
    private BaseCoffeeIngredients secondCoffeeIngredients;

    public CompoundCoffeeIngredients(BaseCoffeeIngredients firstCoffeeIngredients, BaseCoffeeIngredients secondCoffeeIngredients) {
        this.firstCoffeeIngredients = firstCoffeeIngredients;
        this.secondCoffeeIngredients = secondCoffeeIngredients;
    }

    public CompoundCoffeeIngredients(BaseCoffeeIngredients firstCoffeeIngredients) {
        this.firstCoffeeIngredients = firstCoffeeIngredients;
    }

    public void addSecondIngredient(BaseCoffeeIngredients secondCoffeeIngredients) {
        if (this.secondCoffeeIngredients == null) {
            this.secondCoffeeIngredients = secondCoffeeIngredients;
        } else {
            if (this.secondCoffeeIngredients.getClass() == CompoundCoffeeIngredients.class) {
                ((CompoundCoffeeIngredients) this.secondCoffeeIngredients).addSecondIngredient(secondCoffeeIngredients);
            } else {
                this.secondCoffeeIngredients = new CompoundCoffeeIngredients(this.secondCoffeeIngredients, secondCoffeeIngredients);
            }
        }
    }

    public BaseCoffeeIngredients getFirstCoffeeIngredients() {
        return firstCoffeeIngredients;
    }

    public BaseCoffeeIngredients getSecondCoffeeIngredients() {
        return secondCoffeeIngredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompoundCoffeeIngredients that = (CompoundCoffeeIngredients) o;
        return Objects.equals(firstCoffeeIngredients, that.firstCoffeeIngredients) &&
                Objects.equals(secondCoffeeIngredients, that.secondCoffeeIngredients);
    }

    @Override
    public String toString() {
        return firstCoffeeIngredients.toString()
                + " + "
                + secondCoffeeIngredients.toString();
    }
}
