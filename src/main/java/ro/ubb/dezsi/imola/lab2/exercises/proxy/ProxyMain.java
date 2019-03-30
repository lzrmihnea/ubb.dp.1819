package ro.ubb.dezsi.imola.lab2.exercises.proxy;

import ro.ubb.dezsi.imola.lab1.ex1Encapsulation.main.InterpreterException;
import ro.ubb.dezsi.imola.lab2.exercises.Car;
import ro.ubb.dezsi.imola.lab2.exercises.adapter.CarReaderAdapter;
import ro.ubb.dezsi.imola.lab2.exercises.service.CarCreationService;
import ro.ubb.dezsi.imola.lab2.exercises.service.ProxyService;

import java.util.List;

public class ProxyMain {
    public static void main(String[] args) {


        CarReaderAdapter carAdapter = new CarReaderAdapter("src/input1.txt");
        List<String> carComps = carAdapter.processFile();
        ProxyService pxy = new ProxyService();

        Car car = pxy.createCar(carComps);
        assert(car !=null);


    }
}
