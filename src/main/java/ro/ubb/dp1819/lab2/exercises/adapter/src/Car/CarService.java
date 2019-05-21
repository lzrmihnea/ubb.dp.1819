package Car;

import Utils.ReadingService;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private ReadingService readingService;
    private List<Car> cars;

    CarService() {
        this.readingService = new ReadingService("D:\\ubb\\A3S2\\Design Patterns\\Lab2\\adapter\\src\\Car\\parts.txt");
        this.cars = new ArrayList<>();
    }

    public void assembleCars() {
        List<String> lines = readingService.readIngredients();
        for (int i = 0; i < lines.size() - 1; i++) {
            String[] parts = lines.get(i).split(" ");
            cars.add(new Car(Wheels.valueOf(parts[0]), Chassis.valueOf(parts[1]), Engine.valueOf(parts[2]), Paint.valueOf(parts[3])));
        }
    }

    public void printCars(){
        for(Car c: cars)
            System.out.println(c);
    }
}
