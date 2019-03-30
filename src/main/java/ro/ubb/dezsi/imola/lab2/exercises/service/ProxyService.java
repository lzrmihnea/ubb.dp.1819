package ro.ubb.dezsi.imola.lab2.exercises.service;
import ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main.InterpreterException;
import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.component.CarComponent;
import ro.ubb.dezsi.imola.lab2.exercises.pricing.PriceableComponent;

import java.util.List;

public class ProxyService {

    public Car createCar(List<String> carInputComponents) {
        CarCreationService cs = new CarCreationService();
        Car car;
        try {
            car = cs.createCar(carInputComponents);
            System.out.println("[PROXY SERVICE] CAR CREATION \n"+car);
            System.out.println("[PROXY SERVICE]  TOTAL COST \n"+car.getPrice());
            System.out.println("[PROXY SERVICE]  ELEMENT COSTS");
            for (PriceableComponent e : car.getElements())
                System.out.println(((CarComponent)e).getString()+" -- Cost: "+e.getPrice());


            return car;
        } catch (InterpreterException e) {
            e.printStackTrace();
        }
        return null;
    }

}
