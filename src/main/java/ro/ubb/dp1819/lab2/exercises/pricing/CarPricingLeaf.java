package ro.ubb.dp1819.lab2.exercises.pricing;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;
import ro.ubb.dp1819.lab2.exercises.component.CarComponent;
import ro.ubb.dp1819.lab2.exercises.decoration.CarDecorations;

public class CarPricingLeaf implements CarPriceable {

    private CarComponent component;
    private CarDecorations decoration;

    public CarPricingLeaf(CarComponent component){
        this.component = component;
        this.component.assignPrice();
    }

    public CarPricingLeaf(CarDecorations decoration){
        this.decoration = decoration;
    }

    @Override
    public Long getPrice() {
        if (component != null)
            return component.getPrice();
        else
            return decoration.getPrice();
    }
}
