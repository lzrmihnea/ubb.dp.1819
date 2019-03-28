package ro.ubb.dp1819.lab2.exercises.adapter;

import ro.ubb.dp1819.lab1.exercises.Encapsulation_1_1.ReadFileServiceImpl;
import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.*;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingComposite;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingLeaf;
import ro.ubb.dp1819.lab2.exercises.pricing.PriceableComponent;
import ro.ubb.dp1819.lab2.exercises.service.CarCreationService;

import java.io.IOException;
import java.sql.PreparedStatement;

public class adapterStart {
    public static void main(String[] args){
        //ReadFileServiceImpl readFileServiceImpl = new ReadFileServiceImpl();
        //MakeCoffeeService makeCoffeeService = new MakeCoffeeService();
        ReadFileServiceImpl readFileServiceImpl = new ReadFileAdapter();
        CarCreationService carCreationService = new CarCreationService();
        Car car = null;
        try {
            readFileServiceImpl.readFile("D:\\Faculta\\An III\\Semestru_2\\Design Patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab2\\exercises\\adapter\\input.txt");
            //readFileServiceImpl.getLines().forEach(System.out::println);
            car = carCreationService.createCar(readFileServiceImpl.getLines());
            car.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CarPricingLeaf leaf1 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Engine.class)).findAny().get()); //new CarPricingLeaf(new Engine("electric"));
        CarPricingLeaf leaf2 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Chassis.class)).findAny().get()); //new CarPricingLeaf(new Chassis("titanium"));
        CarPricingLeaf leaf3 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Wheel.class)).findAny().get()); //new CarPricingLeaf(new Wheel("summer",4));
        CarPricingLeaf leaf4 = new CarPricingLeaf(car.getComponents().stream()
                .filter(s -> s.getClass().equals(Paint.class)).findAny().get()); //new CarPricingLeaf(new Paint("red"));

        CarPricingComposite comp = new CarPricingComposite();
        comp.addElement(leaf2);
        comp.addElement(leaf3);
        comp.addElement(leaf4);

        CarPricingComposite carComposite = new CarPricingComposite();
        carComposite.addElement(comp);
        carComposite.addElement(leaf1);
        //car.setRoot();
        System.out.println(carComposite.getPrice());


        //makeCoffeeService.make(readFileServiceImpl.getLines());
    }
}
