package ro.ubb.dp1819.lab1.exercises.entity;

import ro.ubb.dp1819.lab1.exercises.entity.Coffee;

public class Espresso implements Coffee {
    @Override
    public void printType() {
        System.out.println("espresso");
    }
}
