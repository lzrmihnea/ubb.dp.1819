package csorba.norberth.lab1.factory;

import csorba.norberth.lab1.models.Coffee;
import csorba.norberth.lab1.models.Ingredient;

import java.util.List;

public interface ICoffeeFactory {
    Coffee create(List<Ingredient> ingredients) throws ClassNotFoundException;
}
