package ro.ubb.dp1819.lab1.alonso.lucia.ex11;

import java.util.List;

public class main {

    public static void main(String [ ] args){
        StringService ss = new StringService();
        List<String> StringList = ss.fileToStringList();
        IngredientsService is = new IngredientsService();
        List<Ingredient> ingredientList = is.stringListToIngredients(StringList);
        System.out.println(ingredientList);
    }

}
