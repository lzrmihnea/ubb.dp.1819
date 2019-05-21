package Car;

import Utils.IExecutingService;

public class CarServiceAdapter implements IExecutingService {
    private CarService carService;

    public CarServiceAdapter(){
        this.carService = new CarService();
    }
    @Override
    public void makeCoffee() {
        carService.assembleCars();
    }

    @Override
    public void printCoffees() {
        carService.printCars();
    }
}
