package ro.ubb.dp1819.fulea.razvan.lab2.proxy;

public class CarServiceProxy implements ICarService{
    private CarService service;

    @Override
    public Car buildCar(String brand, String model) {
        if (service == null){
            service = new CarService();
        }
        Car car = service.buildCar(brand, model);
        System.out.println("Created a new " + brand);
        System.out.println("\tPrice: " + car.getPrice() + "\n");
        return car;
    }
}
