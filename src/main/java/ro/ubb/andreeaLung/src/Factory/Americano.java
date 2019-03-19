package Factory;

public class Americano implements Coffee {
    @Override
    public CoffeeType getType() {
        return CoffeeType.AMERICANO;
    }
}
