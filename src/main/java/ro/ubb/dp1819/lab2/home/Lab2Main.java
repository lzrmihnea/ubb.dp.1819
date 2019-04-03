package ro.ubb.dp1819.lab2.home;

import ro.ubb.dp1819.lab2.exercises.ICreation;
import ro.ubb.dp1819.lab2.exercises.service.CarCreationServiceProxy;

public class Lab2Main {

    public static void main(String[] args) {
        CarAdapter carAdapter = new CarAdapter("D:\\GitWorkspace\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab2\\home\\data.in");
        carAdapter.run();

        ICreation service = new CarCreationServiceProxy(carAdapter.getComponents());
//        service.createCar();

        service.createCoolCar();
    }

}
