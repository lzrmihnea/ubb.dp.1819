package ro.ubb.dp1819.fulea.razvan.lab2.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePriceComponent extends PriceComponent {
    private List<PriceComponent> componentList;

    public CompositePriceComponent(String name){
        super(name);
        this.componentList = new ArrayList<>();
    }

    public void add(PriceComponent component){
        this.componentList.add(component);
    }

    public void remove(PriceComponent component){
        this.componentList.remove(component);
    }

    @Override
    Integer getPrice() {
        Integer result = 0;
        for (PriceComponent component: componentList){
            result += component.getPrice();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (PriceComponent component: componentList){
            sb.append(component.toString()).append(",");
        }
        sb.append("]");
        return "CompositePriceComponent{" +
                "name='" + name + '\'' +
                ", price=" + getPrice() +
                ", componentList=" + sb.toString() +
                '}';
    }
}
