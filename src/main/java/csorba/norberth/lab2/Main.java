package csorba.norberth.lab2;

import csorba.norberth.lab1.encapsulation.FileReaderService;
import csorba.norberth.lab1.encapsulation.IReaderService;
import csorba.norberth.lab2.adapter.CarPartInterpreter;
import csorba.norberth.lab2.adapter.ICarPartInterpreter;
import csorba.norberth.lab2.exercises.Car;
import csorba.norberth.lab2.exercises.CarPriceable;
import csorba.norberth.lab2.exercises.decoration.FlashyLights;
import csorba.norberth.lab2.exercises.decoration.Nos;
import csorba.norberth.lab2.exercises.decoration.Spoiler;
import csorba.norberth.lab2.exercises.pricing.CarPricingComposite;
import csorba.norberth.lab2.exercises.pricing.CarPricingLeaf;
import csorba.norberth.lab2.exercises.pricing.PriceableComponent;
import csorba.norberth.lab2.exercises.service.CarCreationService;
import csorba.norberth.lab2.exercises.service.CarCreationServiceProxy;
import csorba.norberth.lab2.exercises.service.ICarCreationService;
import csorba.norberth.lab2.models.CarPart;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================ADAPTER=========================");
        adapter();
        System.out.println("=========================BRIDGE=========================");
        bridge();
        System.out.println("=========================COMPOSITE=========================");
        composite();
        System.out.println("=========================PROXY=========================");
        proxy();
        System.out.println("=========================DECORATOR=========================");
        decorator();
    }

    private static void adapter() {
        IReaderService readerService = new FileReaderService();
        ICarPartInterpreter carPartInterpreter = new CarPartInterpreter();
        try {
            List<CarPart> carParts = carPartInterpreter
                    .interpretCarParts(readerService.read("src\\main\\java\\csorba\\norberth\\lab2\\carparts.txt"));
            carParts.forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void bridge(){
        IReaderService readerService = new FileReaderService();
        ICarCreationService service = new CarCreationService(new CarPartInterpreter());
        try{
            Car car = service.createCar(readerService.read("src\\main\\java\\csorba\\norberth\\lab2\\carparts.txt"));
            System.out.println(car);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void composite(){
        CarPricingComposite root = new CarPricingComposite();
        root.addElement(new CarPricingLeaf(200));
        root.addElement(new CarPricingLeaf(300));
        root.addElement(new CarPricingLeaf(400));
        System.out.println(root.getPrice());
    }

    private static void proxy(){
        IReaderService readerService = new FileReaderService();
        ICarCreationService service = new CarCreationServiceProxy();
        try{
            service.createCar(readerService.read("src\\main\\java\\csorba\\norberth\\lab2\\carparts.txt"));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void decorator(){
        IReaderService readerService = new FileReaderService();
        ICarCreationService service = new CarCreationService(new CarPartInterpreter());
        try{
            Car car = service.createCar(readerService.read("src\\main\\java\\csorba\\norberth\\lab2\\carparts.txt"));
            CarPriceable tunedCar = new FlashyLights(new Nos( new Spoiler(car)));
            System.out.println("base car price: " + car.getPrice());
            System.out.println("tuned car price: " + tunedCar.getPrice());
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
