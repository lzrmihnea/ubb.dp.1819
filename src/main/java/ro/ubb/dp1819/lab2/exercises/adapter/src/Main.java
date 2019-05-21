import Car.CarServiceAdapter;
import Coffee.CoffeeService;
import Utils.IExecutingService;

public class Main {

    public static void main(String[] args) {
        IExecutingService service = new CarServiceAdapter();
        service.makeCoffee();
        service.printCoffees();
    }
}
