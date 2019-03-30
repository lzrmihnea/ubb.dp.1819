package ro.ubb.dezsi.imola.lab2.exercises.pricing;

import ro.ubb.dezsi.imola.lab2.exercises.component.CarComponentWithType;

public class CarPricingLeaf implements PriceableComponent {

    private PriceableComponent carPriceableEl;

    public CarPricingLeaf(PriceableComponent carPriceableEl) {
        this.carPriceableEl = carPriceableEl;
    }

    public CarPricingLeaf() {
    }

    @Override
    public Long getPrice() {
        return 15000L;
    }


    public PriceableComponent getCarPriceableEl() {
        return carPriceableEl;
    }

    public void setCarPriceableEl(PriceableComponent carPriceableEl) {
        this.carPriceableEl = carPriceableEl;
    }
}
