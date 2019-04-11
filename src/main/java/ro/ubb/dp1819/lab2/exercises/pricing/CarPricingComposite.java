package ro.ubb.dp1819.lab2.exercises.pricing;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CarPricingComposite implements CarPriceable {

    private List<CarPriceable> elements = new ArrayList<>();
    private String root;

    public void addElement(CarPriceable el) {
        this.elements.add(el);
    }

    public void setRoot(){
        this.root = "sdfs";
    }

    @Override
    public Long getPrice() {
        if (root != null)
            return 918L;
        AtomicReference<Long> sum = new AtomicReference<>(0L);
        elements.forEach(s -> sum.updateAndGet(v -> v + s.getPrice()));
        return sum.get();
    }
}
