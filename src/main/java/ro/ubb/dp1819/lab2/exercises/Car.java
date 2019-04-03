package ro.ubb.dp1819.lab2.exercises;

import ro.ubb.dp1819.lab2.exercises.pricing.PriceableComponent;

import java.util.ArrayList;
import java.util.List;

public class Car implements Driveable{

    private List<PriceableComponent> components;
    public Car() {
        this.components = new ArrayList<>();
    }

    @Override
    public void addComponent(PriceableComponent component){
        this.components.add(component);
    }

    @Override
    public void printCar(){
        for (PriceableComponent carComponent: this.components){
            System.out.println(carComponent.getClass().getSimpleName());
        }
    }

    @Override
    public Long getPrice() {
        Long price = 0L;
        for (PriceableComponent component: components){
            price = price + component.getPrice();
        }
        return price;
    }
}
