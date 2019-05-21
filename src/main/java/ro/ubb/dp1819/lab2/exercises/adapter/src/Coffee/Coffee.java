package Coffee;

public class Coffee {

    private String quantity;
    private String measure;
    private String ingredient;
    private String preference;

    Coffee(String quantity, String measure, String ingredient, String preference) {
        this.quantity = quantity;
        this.measure = measure;
        this.ingredient = ingredient;
        this.preference = preference;
    }

    Coffee(String quantity, String measure, String ingredient) {
        this.quantity = quantity;
        this.measure = measure;
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        if(preference!=null)
            return quantity +" "+measure+" coffee with "+ingredient+", "+preference;
        else
            return quantity +" "+measure+" coffee with "+ingredient;
    }
}
