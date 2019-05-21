package lab1;

interface IFactory {
    Coffee brewCoffee(String ingredients);
}

class CoffeeFactory implements IFactory {

    @Override
    public Coffee brewCoffee(String ingredients) {
        switch (ingredients) {
            case Coffee.americano:
                return new Americano();
            case Coffee.cappucino:
                return new Cappuccino();
            case Coffee.espresso:
                return new Espresso();
            case Coffee.latteMacchiato:
                return new LatteMacchiato();
            default:
                return new Espresso();
        }
    }
}

