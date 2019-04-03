package Composite;

public class CarPricingLeaf implements PriceableComponent {

    private Long price = 0L;

    private PriceableComponent carPriceableEl = null;

    public CarPricingLeaf(Long price) {
        this.price = price;
    }

    public CarPricingLeaf(PriceableComponent carPriceableEl) {
        this.carPriceableEl = carPriceableEl;
    }

    public CarPricingLeaf(Long price, PriceableComponent carPriceableEl) {
        this.price = price;
        this.carPriceableEl = carPriceableEl;
    }

    @Override
    public Long getPrice() {
        if(carPriceableEl!=null)
            return price + carPriceableEl.getPrice();
        return price;
    }
}
