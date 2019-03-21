package ro.ubb.dp1819.lab1.alonso.lucia.ex11;

import java.util.ArrayList;
import java.util.List;

public class IngredientsService {


    public static List<Ingredient> stringListToIngredients(List<String> listeString){

        List<Ingredient> listeIngredients = new ArrayList<>();

        for (String st: listeString) {

            // cada string de la lista es un ingrediente
            // cortar en palabras -- si 3 o 4 - ingrediente

            String[] result = st.split(" ");
            if (result.length == 3) {
                Ingredient ingredient = new Ingredient(Double.parseDouble(result[0]), result[1], result[2], null);
                listeIngredients.add(ingredient);
            }
            if (result.length == 4){
                Ingredient ingredient = new Ingredient(Double.parseDouble(result[0]), result[1], result[2], result[3]);
                listeIngredients.add(ingredient);
            }

        }

        return listeIngredients;
    }

}
