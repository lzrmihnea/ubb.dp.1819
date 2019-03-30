package ro.ubb.dp1819.fulea.razvan.lab2.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {

    public static void run() {
        ICarService service = new CarServiceProxy();
        List<Car> cars = new ArrayList<>();

        cars.add(service.buildCar("Audi", "E-Tron"));
        cars.add(service.buildCar("Mercedes", "E150"));
        cars.add(service.buildCar("BMW", "730"));
        cars.add(service.buildCar("Dacia", "1310"));

        for (Car car: cars){
            System.out.print(car + " ");
        }
        System.out.println();
    }

}
