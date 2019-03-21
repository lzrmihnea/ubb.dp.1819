package ro.ubb.dp1819.fulea.razvan.lab1.factory;

import java.util.Random;

public class CoffeeFactoryMain {

    private static CoffeeIngredients makeEspressoIngredients(){
        CoffeeIngredients ingredients = new CoffeeIngredients();
        ingredients.setWaterCups(2);
        ingredients.setBeanCups(0.25);
        return ingredients;
    }

    private static CoffeeIngredients makeCapucinnoIngredients(){
        CoffeeIngredients ingredients = new CoffeeIngredients();
        ingredients.setWaterCups(2);
        ingredients.setBeanCups(0.25);
        ingredients.setMilk(100);
        return ingredients;
    }

    private static CoffeeIngredients makeAmericanoIngredients(){
        CoffeeIngredients ingredients = new CoffeeIngredients();
        ingredients.setWaterCups(4);
        ingredients.setBeanCups(0.25);
        return ingredients;
    }

    private static CoffeeIngredients makeMorningstartIngredients(){
        CoffeeIngredients ingredients = new CoffeeIngredients();
        ingredients.setWaterCups(2);
        ingredients.setBeanCups(1.0);
        ingredients.setWhiskey(50);
        return ingredients;
    }

    private static boolean isEspresso(CoffeeIngredients ingredients){
        return ingredients.getWaterCups() == 2 && ingredients.getBeanCups() == 0.25 && ingredients.getMilk() == null;
    }

    private static boolean isCappuccino(CoffeeIngredients ingredients){
        return ingredients.getWaterCups() == 2 && ingredients.getBeanCups() == 0.25 && ingredients.getMilk() == 100;
    }

    private static boolean isAmericano(CoffeeIngredients ingredients){
        return ingredients.getWaterCups() == 4 && ingredients.getBeanCups() == 0.25;
    }

    private static boolean isMorningstart(CoffeeIngredients ingredients){
        return ingredients.getWaterCups() == 2 && ingredients.getBeanCups() == 1.0 && ingredients.getWhiskey() == 50;
    }

    public static void run(){
        CoffeeIngredients ingredients = null;

        Random random = new Random();
        int option = random.nextInt(4);
        switch (option){
            case 0:
                ingredients = makeEspressoIngredients();
                break;
            case 1:
                ingredients = makeCapucinnoIngredients();
                break;
            case 2:
                ingredients = makeAmericanoIngredients();
                break;
            case 3:
                ingredients = makeMorningstartIngredients();
                break;
        }

        AbstractCoffeeFactory factory = null;

        if (isEspresso(ingredients)){
            factory = new EspressoFactory();
        } else if (isCappuccino(ingredients)){
            factory = new CappuccinoFactory();
        } else if (isAmericano(ingredients)){
            factory = new AmericanoFactory();
        } else if(isMorningstart(ingredients)){
            factory = new MorningstartFactory();
        } else {
            System.err.println("Invalid coffee!");
            System.exit(1);
        }

        ICoffee coffee = factory.makeCoffee(ingredients);
        coffee.drink();
    }

}