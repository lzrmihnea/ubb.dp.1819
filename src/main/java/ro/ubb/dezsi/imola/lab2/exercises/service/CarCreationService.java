package ro.ubb.dezsi.imola.lab2.exercises.service;

import org.springframework.stereotype.Service;
import ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main.InterpreterException;
import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.component.*;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.PriceableComponent;

import java.util.Arrays;
import java.util.List;

@Service
public class CarCreationService {

    public Car createCar(List<String> carInputComponents) throws InterpreterException {
        // create the car using the acquired car parts using the same class as in the other examples
        try {
            if (carInputComponents.size() == 0)
                return null;
            List<CarComponent> comps = Arrays.asList(new Engine(carInputComponents.get(0)), new Chassis(carInputComponents.get(1)), new Wheel(carInputComponents.get(2)), new Wheel(carInputComponents.get(3)), new Wheel(carInputComponents.get(4)), new Wheel(carInputComponents.get(5)), new Paint(carInputComponents.get(6)));
            Car car = new Car();
            for (CarComponent cp : comps)
                car.addElement((PriceableComponent) cp);
            return car;
        }catch (Exception e){
            e.printStackTrace();
            throw new InterpreterException("Input type does not correspond to the fields required by the Car class");
        }

    }
}

