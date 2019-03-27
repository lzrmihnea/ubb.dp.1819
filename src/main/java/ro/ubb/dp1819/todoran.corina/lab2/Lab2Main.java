package ro.ubb.dp1819.todoran.corina.lab2;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.CarPriceable;
import ro.ubb.dp1819.lab2.exercises.component.Engine;
import ro.ubb.dp1819.lab2.exercises.component.Paint;
import ro.ubb.dp1819.lab2.exercises.component.Wheel;
import ro.ubb.dp1819.lab2.exercises.decoration.CoolCar;
import ro.ubb.dp1819.lab2.exercises.decoration.FlashyLights;
import ro.ubb.dp1819.lab2.exercises.decoration.Nos;
import ro.ubb.dp1819.lab2.exercises.decoration.Spoiler;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingComposite;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingLeaf;
import ro.ubb.dp1819.lab2.exercises.service.CarCreationService;
import ro.ubb.dp1819.lab2.exercises.service.CarCreationServiceProxy;
import ro.ubb.dp1819.lab2.exercises.service.ICarCreationService;
import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.IReaderService;
import ro.ubb.dp1819.todoran.corina.lab1.encapsulation.ReadFileService;
import ro.ubb.dp1819.todoran.corina.lab2.adapter.CarPartInterpreter;
import ro.ubb.dp1819.todoran.corina.lab2.adapter.ICarPartInterpreter;

import java.io.File;

public class Lab2Main {
    public static void main(String[] args) {
        // 2.1
        File file = new File("src\\main\\java\\ro\\ubb\\dp1819\\todoran.corina\\lab2\\model\\carparts.txt");
        IReaderService readerService = new ReadFileService();
        ICarPartInterpreter carPartInterpreter = new CarPartInterpreter();
        carPartInterpreter.interpretCarParts(readerService.readFile(file))
                .forEach(System.out::println);
        System.out.println("==========================================");


        // 2.2
        ICarCreationService service = new CarCreationService(new CarPartInterpreter());
        System.out.println(service.createCar(readerService.readFile(file)));
        System.out.println("==========================================");

        // 2.3

        CarPricingComposite root = new CarPricingComposite();
        root.addElement(new CarPricingLeaf(new Wheel("summer")));
        root.addElement(new CarPricingLeaf(new Engine("GPL")));
        root.addElement(new CarPricingLeaf(new Paint("red")));
        System.out.println(root.getPrice());
        System.out.println("==========================================");

        // 2.4

        ICarCreationService serviceProxy = new CarCreationServiceProxy();
        serviceProxy.createCar(readerService.readFile(file));
        System.out.println("==========================================");

        // 2.5

        Car car = service.createCar(readerService.readFile(file));
        CarPriceable tunedCar = new CoolCar(new FlashyLights(new Nos(new Spoiler(car))));
        System.out.println("base: " + car.getPrice());
        System.out.println("tuned : " + tunedCar.getPrice());
    }
}
