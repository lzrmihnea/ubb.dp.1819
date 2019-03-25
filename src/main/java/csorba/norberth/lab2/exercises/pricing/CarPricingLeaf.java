package csorba.norberth.lab2.exercises.pricing;

public class CarPricingLeaf implements PriceableComponent {

    private PriceableComponent carPriceableEl;

    private long price;

    public CarPricingLeaf(long price){
        this.price = price;
    }

    @Override
    public Long getPrice() {
        return this.price;
    }
}
