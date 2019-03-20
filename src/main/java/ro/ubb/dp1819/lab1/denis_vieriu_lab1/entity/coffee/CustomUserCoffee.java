package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity.coffee;

import java.util.ArrayList;

public class CustomUserCoffee extends Coffee {

    public CustomUserCoffee(){
        ingredients = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CustomUserCoffee("+ingredients.toString()+")";
    }
}
