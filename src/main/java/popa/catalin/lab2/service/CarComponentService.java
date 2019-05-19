package popa.catalin.lab2.service;

import org.springframework.stereotype.Service;
import popa.catalin.lab1.domain.Ingredient;
import popa.catalin.lab1.solid.IngredientService;
import popa.catalin.lab2.domain.component.AbstractCarComponent;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarComponentService implements CarComponentServiceInterface {
    private CarComponentFactory carComponentFactory = new CarComponentFactory();

    public List<AbstractCarComponent> createComponentsFromStrings(List<String> carInputComponents) {
        List<AbstractCarComponent> carComponents = new ArrayList<>(); //
        List<Ingredient> ingredients = IngredientService.createIngredientsFromStrings(carInputComponents);
        for (Ingredient ingredient : ingredients) {
            int quantity = Math.round(ingredient.getQuantity());
            String name = ingredient.getUnit();
            String type = ingredient.getName();

            AbstractCarComponent component;

            component = carComponentFactory.createNewComponent(name);

            component.setType(type);

            for (int i = 0; i < quantity; i++)
                carComponents.add(component);
        }
        return carComponents;
    }
}
