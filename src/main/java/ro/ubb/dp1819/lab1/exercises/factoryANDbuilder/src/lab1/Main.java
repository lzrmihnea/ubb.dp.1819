package lab1;

public class Main {

    public static void main(String[] args) {
        IFactory factory = new CoffeeFactory();
        final String ingredients = randomCoffee();
        Coffee coffee = factory.brewCoffee(ingredients);
        coffee.brew();
    }

    private static String randomCoffee() {
        final String[] ingredients = new String[5];
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        String americano = coffeeBuilder
                .cup(4)
                .beans(0.25f)
                .build();
        String cappuccino = coffeeBuilder
                .cup(2)
                .beans(0.25f)
                .ingredient("100ml foamed milk")
                .build();
        String espresso = coffeeBuilder
                .cup(2)
                .beans(0.25f)
                .build();
        String latte = coffeeBuilder
                .cup(2)
                .beans(0.25f)
                .ingredient("150ml foamed milk")
                .build();
        ingredients[0] = americano;
        ingredients[1] = cappuccino;
        ingredients[2] = espresso;
        ingredients[3] = latte;
        ingredients[4] = "error";
        final java.util.Random random = new java.util.Random();
        final int randomNumber = random.nextInt(5);
        return ingredients[randomNumber];
    }
}
