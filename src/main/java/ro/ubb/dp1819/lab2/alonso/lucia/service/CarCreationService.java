package ro.ubb.dp1819.lab2.alonso.lucia.service;

import org.springframework.stereotype.Service;
import ro.ubb.dp1819.lab2.alonso.lucia.Car;

import java.util.List;

@Service
public class CarCreationService {

    public Car createCar(String path) {

        StringServiceAdapt ssa = new StringServiceAdapt();
        List<String> carInputComponents = ssa.fileToStringList(path);


        String[] toCar = carInputComponents.get(0).split(" ");
        Car car = new Car(toCar[0], toCar[1], toCar[2], toCar[3]);

        return car;
    }
}
