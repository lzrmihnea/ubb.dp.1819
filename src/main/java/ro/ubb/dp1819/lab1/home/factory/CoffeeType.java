package ro.ubb.dp1819.lab1.home.factory;

import ro.ubb.dp1819.lab1.home.CoffeeIngredient;

public class CoffeeType {
    CoffeeIngredient ingredient1;
    CoffeeIngredient ingredient2;
    CoffeeIngredient ingredient3;

    public CoffeeType createCoffee(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2) {
        if (ingredient1.getQuantity() == 2 && ingredient1.getUnit().equals("cups")
                && ingredient1.getIngredient().equals("water") && ingredient2.getQuantity() == 2
                && ingredient2.getUnit().equals("cups") && ingredient2.getIngredient().equals("coffee-beans")
                && ingredient2.getAdjective().equals("roasted")){
            return new Espresso(ingredient1,ingredient2);
        }

        if (ingredient1.getQuantity() == 4 && ingredient1.getUnit().equals("cups")
                && ingredient1.getIngredient().equals("water") && ingredient2.getQuantity() == 2
                && ingredient2.getUnit().equals("cups") && ingredient2.getIngredient().equals("coffee-beans")
                && ingredient2.getAdjective().equals("roasted")){
            return new Americano(ingredient1,ingredient2);
        }

        return null;
    }

    public CoffeeType createCoffee(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2,CoffeeIngredient ingredient3) {
        if (ingredient1.getQuantity() == 2 && ingredient1.getUnit().equals("cups")
                && ingredient1.getIngredient().equals("water") && ingredient2.getQuantity() == 2
                && ingredient2.getUnit().equals("cups") && ingredient2.getIngredient().equals("coffee-beans")
                && ingredient2.getAdjective().equals("roasted")
                && ingredient3.getQuantity() == 100
                && ingredient3.getUnit().equals("ml")
                && ingredient3.getIngredient().equals("milk")
                && ingredient3.getAdjective().equals("foamed")){
            return new Cappucino(ingredient1,ingredient2,ingredient3);
        }
        return null;
    }
}

class Espresso extends CoffeeType{

    Espresso(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2){
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    @Override
    public Espresso createCoffee(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2) {
        return new Espresso(ingredient1, ingredient2);
    }

    @Override
    public String toString() {
        return "Espresso{}";
    }
}

class Cappucino extends CoffeeType {
    public Cappucino(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2,CoffeeIngredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    @Override
    public Cappucino createCoffee(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2,CoffeeIngredient ingredient3) {
        return new Cappucino(ingredient1, ingredient2, ingredient3);
    }

    @Override
    public String toString() {
        return "Cappucino{}";
    }
}

class Americano extends CoffeeType{

    Americano(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2){
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    @Override
    public Espresso createCoffee(CoffeeIngredient ingredient1, CoffeeIngredient ingredient2) {
        return new Espresso(ingredient1, ingredient2);
    }

    @Override
    public String toString() {
        return "Americano{}";
    }
}
