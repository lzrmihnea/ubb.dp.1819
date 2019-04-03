package Composite;

public class CompositeClient {
    public static void main(String[] args) {
        PriceableComponent composite = new CarPricingComposite();
        PriceableComponent priceableComponent1 = new CarPricingLeaf(new CarPricingLeaf(new CarPricingLeaf(30L)));
        PriceableComponent priceableComponent2 = new CarPricingLeaf(45L);
        PriceableComponent priceableComponent3 = new CarPricingLeaf(new CarPricingLeaf(10L));
        ((CarPricingComposite) composite).addElement(priceableComponent1);
        ((CarPricingComposite) composite).addElement(priceableComponent2);
        ((CarPricingComposite) composite).addElement(priceableComponent3);
        System.out.println(composite.getPrice());
    }
}
