package ro.ubb.dp1819.fulea.razvan.lab2.proxy;

import java.util.Random;

public class CarService implements ICarService{

    @Override
    public Car buildCar(String brand, String model) {
        Integer price = 0;
        switch(brand){
            case "Audi":
                price = randBetween(3000, 5000);
                break;
            case "BMW":
                price = randBetween(1200, 3500);
                break;
            case "Mercedes":
                price = randBetween(4750, 8500);
                break;
            default:
                price = 1337;
                break;
        };
        return new Car(brand, model, price);
    }

    private Integer randBetween(Integer a, Integer b){
        Random random = new Random();
        return random.nextInt(b-a) + a;
    }
}
