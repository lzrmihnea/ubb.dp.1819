package Factory;

public class Espresso implements Coffee {
    @Override
    public CoffeeType getType() {
        return CoffeeType.ESPRESSO;
    }
}
