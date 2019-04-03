package ro.ubb.dp1819.lab2.exercises.pricing;

public class CarPricingLeaf implements PriceableComponent {

    private PriceableComponent carPriceableEl;

    @Override
    public Long getPrice() {
        carPriceableEl.getPrice();
        return null;
    }
}
