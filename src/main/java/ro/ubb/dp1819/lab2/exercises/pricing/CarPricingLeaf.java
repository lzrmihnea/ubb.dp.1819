package ro.ubb.dp1819.lab2.exercises.pricing;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;

public class CarPricingLeaf implements PriceableComponent {

    private CarComponent component;

    public CarPricingLeaf(CarComponent component){
        this.component = component;
        this.component.assignPrice();
    }

    @Override
    public Long getPrice() {
        return component.getPrice();
    }
}
