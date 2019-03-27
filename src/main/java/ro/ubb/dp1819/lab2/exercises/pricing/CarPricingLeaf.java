package ro.ubb.dp1819.lab2.exercises.pricing;

public class CarPricingLeaf implements PriceableComponent {
    private PriceableComponent carPriceableEl;

    public CarPricingLeaf(PriceableComponent carPriceable) {
        this.carPriceableEl = carPriceable;
    }

    @Override
    public Long getPrice() {
        return carPriceableEl.getPrice();
    }
}
