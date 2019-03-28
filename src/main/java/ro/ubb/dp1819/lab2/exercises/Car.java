package ro.ubb.dp1819.lab2.exercises;

import ro.ubb.dp1819.lab2.exercises.component.CarComponent;
import ro.ubb.dp1819.lab2.exercises.implementorBridge.Manufacturer;

import java.util.List;

public abstract class Car implements Driveable {
     protected Manufacturer manufacturer;

     protected Car(Manufacturer manufacturer) {this.manufacturer = manufacturer;}
     @Override
     public abstract void show();
     public abstract List<CarComponent> getComponents();
}

