package ro.ubb.dp1819.fulea.razvan.lab2.adapter;

import java.io.IOException;

public class ReadCarServiceAdapter implements IReadCarService {
    private ReadCoffeeService coffeeService = new ReadCoffeeService();

    @Override
    public CarParts readCar(String filename) throws IOException {
        CarParts carParts = new CarParts();
        Coffee coffee = coffeeService.readCoffee(filename);
        System.out.println("Adapting coffee: " + coffee);

        carParts.setEngine(coffee.getName());
        carParts.setChassis(coffee.getBrand());
        carParts.setWheels(coffee.getType());
        carParts.setPaint(coffee.getOrigin());

        return carParts;
    }
}
