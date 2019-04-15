package lab2.Decorator.decorationClasses;

import lab2.Proxy.CarPriceable;

public abstract class CarDecoration implements CarPriceable {
    private CarPriceable carPriceable;

    public CarDecoration(CarPriceable carPriceable){
        this.carPriceable = carPriceable;
    }

    @Override
    public Long getPrice(){
        return carPriceable.getPrice();
    }

    @Override
    public String toString() {
        return carPriceable.toString();
    }
}
