package ro.ubb.dp1819.lab1.exercises.entity;

public class Builder extends CoffeeBuilder {

    public Builder setNoCupsWater(Integer no){
        this.getCoffee().setWaterCups(no);
        return this;
    }

    public Builder setNoCupsCoffee(Double no) {
        this.getCoffee().setCoffeeCups(no);
        return this;
    }

    public Builder coffeeType(String type) {
        this.getCoffee().setCoffeeType(type);
        return this;
    }

    public Builder extraIngredients(String ingredients) {
        this.getCoffee().setExtraIngredient(ingredients);
        return this;
    }

    public Drinkable build() {
        return this.getCoffee();
    }
}
