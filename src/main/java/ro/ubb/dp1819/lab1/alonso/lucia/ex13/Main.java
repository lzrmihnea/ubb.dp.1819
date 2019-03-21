package ro.ubb.dp1819.lab1.alonso.lucia.ex13;

public class Main {

    public static void main (String [ ] args) {
        Coffee coffee = new Coffee.CoffeeBuilder()
                .addIngredient1("30 ml milk")
                .addIngredient2("20 mg coffee roasted")
                .addIngredient3("2 mg sugar")
                .create();

        System.out.println(coffee.toString());
    }
}
