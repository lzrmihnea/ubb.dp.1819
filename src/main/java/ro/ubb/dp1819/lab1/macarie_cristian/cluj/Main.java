package ro.ubb.dp1819.lab1.macarie_cristian.cluj;

import ro.ubb.cluj.domain.Coffee;
import ro.ubb.cluj.factory.CofeeFactory;
import ro.ubb.cluj.factory.Factory;
import ro.ubb.cluj.service.CoffeeService;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();
        Factory factory = new CofeeFactory();
        Optional<Coffee> coffee = factory.prepareCoffee(coffeeService.getIngredients());
        coffee.ifPresent(Coffee::showContent);
    }
}
