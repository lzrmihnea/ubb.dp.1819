package Factory;

public class Cappuccino implements Coffee {
    @Override
    public CoffeeType getType() {
        return CoffeeType.CAPPUCCINO;
    }
}
