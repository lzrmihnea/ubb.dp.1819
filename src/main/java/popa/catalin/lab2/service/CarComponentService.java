package popa.catalin.lab2.service;

import org.springframework.stereotype.Service;
import popa.catalin.lab1.domain.Ingredient;
import popa.catalin.lab1.solid.IngredientService;
import popa.catalin.lab2.CarException;
import popa.catalin.lab2.domain.component.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarComponentService implements CarComponentServiceInterface {
    public List<AbstractCarComponent> createComponentsFromStrings(List<String> carInputComponents) {
        List<AbstractCarComponent> carComponents = new ArrayList<>(); //
        List<Ingredient> ingredients = IngredientService.createIngredientsFromStrings(carInputComponents);
        for (Ingredient ingredient : ingredients) {
            int quantity = Math.round(ingredient.getQuantity());
            String name = ingredient.getUnit();
            String type = ingredient.getName();

            AbstractCarComponent component;

            switch (name) {
                case "chassis":
                    component = new Chassis();
                    break;
                case "engine":
                    component = new Engine();
                    break;
                case "paint":
                    component = new Paint();
                    break;
                case "wheel":
                    component = new Wheel();
                    break;
                default:
                    throw new CarException("Invalid car part name boii");
            }

            component.setType(type);

            for (int i = 0; i < quantity; i++)
                carComponents.add(component);
        }
        return carComponents;
    }
}
