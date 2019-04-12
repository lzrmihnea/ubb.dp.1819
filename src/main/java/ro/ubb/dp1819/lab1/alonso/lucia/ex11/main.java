package ro.ubb.dp1819.lab1.alonso.lucia.ex11;

import java.io.File;
import java.util.List;

public class main {

    public static void main(String [ ] args){

        IngredientsService is = new IngredientsService();

        //absPath to get the absolute path to the file
        String absPath = new File("").getAbsolutePath();
        System.out.println(is.stringListToIngredients(absPath+"\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\alonso\\lucia\\ex11\\exemple"));
    }

}
