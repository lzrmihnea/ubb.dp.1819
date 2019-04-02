package Adapter;

import SOLID.CoffeeReadingService;
import SOLID.FileReadingService;

import java.util.List;

public class AdapterClient {
    public static void main(String[] args) {
        // Adapter
        System.out.println("\nAdapter\n");
        FileReadingService fileReadingService = new CoffeeReadingService();
        Adapter carAdapter = new Adapter(fileReadingService);
        CarPartsReadingService carPartsReadingService = new CarPartsReadingService(carAdapter);
        List<String> carParts = carPartsReadingService.readCarPartsFromFile("src/car_parts");

        carParts.forEach(System.out::println);

    }
}
