package ro.ubb.dp1819.fulea.razvan.lab2.bridge.model;

import java.util.List;

public abstract class Car {
    protected String name;
    protected List<String> parts;

    public Car(String name, List<String> parts){
        this.name = name;
        this.parts = parts;
    }

}
