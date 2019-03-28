package ro.ubb.dp1819.lab1.exercises.entity;

public abstract class AbstractBuilder {
    public abstract AbstractBuilder setNoCupsWater(Integer no);
    public abstract AbstractBuilder setNoCupsCoffee(Double no);
    public abstract AbstractBuilder coffeeType(String type);
    public abstract AbstractBuilder extraIngredients(String ingredients);
    public abstract Drinkable build();
}
