package ro.ubb.dp1819.lab1.exercises.Encapsulation_1_1;

import java.util.Arrays;
import java.util.List;

public class MakeCoffeeService {
    private List<String> UNITS = Arrays.asList("l", "dl", "cl", "ml");
    private List<String> INGREDIENTS = Arrays.asList("milk", "chocolate", "foamed-milk");
    private List<String> OPTIONAL = Arrays.asList("boiled", "steamed", "roasted");

    MakeCoffeeService(){ }

    public void make(List<String> ingredients){
        final int[] index = {0};

        ingredients.forEach(elem -> {
            String[] elems = elem.split(" ");

            if (checkIngredients(elems, elems.length)) {
                System.out.println("Coffee " + index[0] + ": " + elem);
                index[0]++;
            } else
                System.out.println("Invalid ingredients: " + elem);
        });
    }

    private boolean checkIngredients(String[] elems, Integer length){
        Boolean q = false, u = false, i = false, o = false;

        if (elems.length > 4 || elems.length < 3)
            return false;

        for (String elem : elems) {
            try{
                Integer.parseInt(elem);
                if (q.equals(false))
                    q = true;
                else
                    return !q;
            }catch (Exception ignored){ }

            if (UNITS.contains(elem)) {
                if (u.equals(false))
                    u = true;
                else
                    return !u;
            } else if (INGREDIENTS.contains(elem)){
                if (i.equals(false))
                    i = true;
                else
                    return !i;
            } else if (length.equals(4) && OPTIONAL.contains(elem)){
                if (o.equals(false))
                    o = true;
                else
                    return !o;
            }
        }
        return true;
    }

}
