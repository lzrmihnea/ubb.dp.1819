package lab1;

import java.util.ArrayList;
import java.util.List;

public class ExecutingService {
    private List<Coffee> coffees;

    ExecutingService() {
        this.coffees = new ArrayList<>();
    }

    public List<Coffee> makeCoffees(List<String> lines) {
        for (int i = 0; i < lines.size() - 1; i++) {
            String[] ingredients = lines.get(i).split(" ");
            if (ingredients.length == 3)
                coffees.add(new Coffee(ingredients[0], ingredients[1], ingredients[2]));
            else if (ingredients.length == 4)
                coffees.add(new Coffee(ingredients[0], ingredients[1], ingredients[2], ingredients[3]));
        }
        return coffees;
    }
}
