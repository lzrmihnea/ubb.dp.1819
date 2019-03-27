package ro.ubb.dp1819.luca.alex.ex1_1;

public enum CoffeeType {

    ESPRESSO("espresso"),
    CAPPUCCINO("cappuccino"),
    AMERICANO("americano"),
    LATTE("latte");

    private String value;

    private CoffeeType(String value) {
        this.value = value;
    }
}
