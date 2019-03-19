package Factory;

public class Macchiato implements Coffee {
    @Override
    public CoffeeType getType() {
        return CoffeeType.MACCHIATO;
    }
}
