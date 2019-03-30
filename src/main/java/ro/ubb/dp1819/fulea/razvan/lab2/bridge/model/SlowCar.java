package ro.ubb.dp1819.fulea.razvan.lab2.bridge.model;

import java.util.List;

public class SlowCar extends Car {

    public SlowCar(String name, List<String> parts){
        super(name, parts);
    }

    @Override
    public String toString() {
        return "SlowCar{" +
                "name='" + name + '\'' +
                ", parts=" + parts +
                '}';
    }
}
