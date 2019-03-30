package ro.ubb.dp1819.fulea.razvan.lab2.bridge.model;

import java.util.List;

public class RaceCar extends Car {

    public RaceCar(String name, List<String> parts){
        super(name, parts);
    }

    @Override
    public String toString() {
        return "RaceCar{" +
                "name='" + name + '\'' +
                ", parts=" + parts +
                '}';
    }
}
