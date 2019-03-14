package barnutiu.denis.lab1.Encapsulation;



import barnutiu.denis.lab1.Domain.CoffeeIngredient;

import java.util.ArrayList;
import java.util.List;

public class CoffeeIngredientService {



    public List<CoffeeIngredient> getCoffeeIngredientFromString(List<String> stringList){
        List<CoffeeIngredient> coffeeIngredients=new ArrayList<>();
        for(String linie:stringList){
            String[] attributes=linie.split(";");
            if(attributes.length!=3 && attributes.length!=4)
                throw new RuntimeException("Eroare la conversie");
            else{
                double quantity=Double.parseDouble(attributes[0]);
                if(attributes.length==4)
                    coffeeIngredients.add(new CoffeeIngredient(quantity,attributes[1],attributes[2],attributes[3]));
                else
                    coffeeIngredients.add(new CoffeeIngredient(quantity,attributes[1],attributes[2]));

            }
        }

        return coffeeIngredients;

    }


}
