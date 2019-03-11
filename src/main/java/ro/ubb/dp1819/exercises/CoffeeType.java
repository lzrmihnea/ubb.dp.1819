package ro.ubb.dp1819.exercises;

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
