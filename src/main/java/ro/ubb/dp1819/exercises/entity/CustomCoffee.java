package ro.ubb.dp1819.exercises.entity;

import java.util.ArrayList;

public class CustomCoffee extends Coffee{

    public CustomCoffee(){
        ingredients = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CustomCoffee: "+ingredients.toString();
    }
}
