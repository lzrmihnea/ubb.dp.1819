package ro.ubb.dp1819.fulea.razvan.lab2.decorator;

import java.util.ArrayList;
import java.util.List;

public class CarPricingComposite implements CarPriceable {
    private List<CarPriceable> componentList;

    public CarPricingComposite(){
        this.componentList = new ArrayList<>();
    }

    @Override
    public Long getPrice() {
        Long price = 0L;
        for (CarPriceable component: componentList){
            price += component.getPrice();
        }
        return price;
    }

    public void add(CarPriceable carPriceable){
        this.componentList.add(carPriceable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (CarPriceable component: componentList){
            sb.append("\t").append(component.toString()).append(", price=").append(component.getPrice()).append("\n");
        }
        sb.append("]");
        return "CarPricingComposite{" +
                "componentList=" + sb.toString()     +
                ",price=" + getPrice() +
                '}';
    }
}
