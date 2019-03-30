package ro.ubb.dezsi.imola.lab2.exercises.adapter;

import ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main.InterpreterException;
import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.service.CarCreationService;

import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        CarReaderAdapter carAdapter = new CarReaderAdapter("src/input1.txt");
        List<String> carComps = carAdapter.processFile();
        CarCreationService cs = new CarCreationService();
        Car car;

        {
            try {
                car = cs.createCar(carComps);
                System.out.println(car);
            } catch (InterpreterException e) {
                e.printStackTrace();
            }
        }

    }
}
