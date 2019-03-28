package ro.ubb.dp1819.lab1.exercises;

import ro.ubb.dp1819.lab1.exercises.entity.Drinkable;

public class StartFactory {
    private static CoffeeFactory coffeeFactory = new CoffeeFactory();

    public static void main(String[] args){
        Drinkable coffee = coffeeFactory.makeCoffee("2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk");
        System.out.println(coffee.getClass().getSimpleName()
                + ": "
                + coffee.getCoffee());
    }
}
