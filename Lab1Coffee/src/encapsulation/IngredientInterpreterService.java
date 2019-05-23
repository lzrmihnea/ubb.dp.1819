package encapsulation;

public class IngredientInterpreterService {
    public IngredientInterpreterService(){}

    public boolean validateIngredient(String ingredient) {
        String[] words = ingredient.split(" ");
        if(words.length != 3 && words.length != 4){
            return false;
        }

        return true;
    }

    public Ingredient createIngredient(String line) {
        String[] words = line.split(" ");

        if(words.length == 3) {
            return new Ingredient(
                    Double.parseDouble(words[0]),
                    words[1],
                    words[2]
            );
        }

        if(words.length == 4) {
            return new Ingredient(
                  Double.parseDouble(words[0]),
                  words[1],
                  words[2],
                  words[3]
            );
        }

        return null;
    }
}
