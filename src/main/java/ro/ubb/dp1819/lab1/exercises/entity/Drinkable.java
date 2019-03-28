package ro.ubb.dp1819.lab1.exercises.entity;

public abstract class Drinkable {

    protected Integer noCupsWater;
    protected Double noCoffeeCups;
    protected String  type;
    protected String  extraIngredients = "";

    protected abstract void setWaterCups(Integer nr);
    protected abstract void setCoffeeCups(Double nr);
    protected abstract void setCoffeeType(String type);
    protected abstract void setExtraIngredient(String extra);
    public abstract String getCoffee();

    protected String getString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (noCupsWater != null)
            stringBuilder.append(noCupsWater).append(" cups of water ");
        if (noCoffeeCups != null)
            stringBuilder.append("+ ").append(noCoffeeCups).append(" cups coffee-beans");
        if (type != null)
            stringBuilder.append(type);
        if (extraIngredients != null)
            stringBuilder.append(extraIngredients);

        return  stringBuilder.toString();
    }

}
