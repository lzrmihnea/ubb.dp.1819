package ro.ubb.dp1819.lab2.home;

import ro.ubb.dp1819.lab1.home.ICoffee;

import java.util.List;

public class CarAdapter implements ICoffee{
    private CarService service;

    public CarAdapter(String filename) {
        this.service = new CarService(filename);
    }


    @Override
    public void run() {
        service.interprets();
    }

    public List<CarPart> getComponents() {
        return this.service.getComponents();
    }
}
