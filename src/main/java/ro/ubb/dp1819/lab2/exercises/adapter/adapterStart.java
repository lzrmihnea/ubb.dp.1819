package ro.ubb.dp1819.lab2.exercises.adapter;

import ro.ubb.dp1819.lab1.exercises.Encapsulation_1_1.ReadFileServiceImpl;
import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.*;
import ro.ubb.dp1819.lab2.exercises.decoration.Nos;
import ro.ubb.dp1819.lab2.exercises.decoration.Spoiler;
import ro.ubb.dp1819.lab2.exercises.implementorBridge.LamborghiniCar;
import ro.ubb.dp1819.lab2.exercises.implementorBridge.SportsCar;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingComposite;
import ro.ubb.dp1819.lab2.exercises.pricing.CarPricingLeaf;
import ro.ubb.dp1819.lab2.exercises.pricing.PriceableComponent;
import ro.ubb.dp1819.lab2.exercises.service.CarCreationService;
import ro.ubb.dp1819.lab2.exercises.service.CarCreationServiceProxy;
import ro.ubb.dp1819.lab2.exercises.service.CarService;

import java.io.IOException;
import java.sql.PreparedStatement;

public class adapterStart {
    public static void main(String[] args){
        //ReadFileServiceImpl readFileServiceImpl = new ReadFileServiceImpl();
        //MakeCoffeeService makeCoffeeService = new MakeCoffeeService();
        ReadFileServiceImpl readFileServiceImpl = new ReadFileAdapter();
        CarService carService = null;

        try {
            readFileServiceImpl.readFile("D:\\Faculta\\An III\\Semestru_2\\Design Patterns\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab2\\exercises\\adapter\\input.txt");
            //readFileServiceImpl.getLines().forEach(System.out::println);
            carService = new CarCreationServiceProxy(readFileServiceImpl.getLines());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(carService.ShowCar());
        //makeCoffeeService.make(readFileServiceImpl.getLines());
    }
}
