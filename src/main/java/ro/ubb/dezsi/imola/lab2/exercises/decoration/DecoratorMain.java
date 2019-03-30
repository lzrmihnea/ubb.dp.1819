package ro.ubb.dezsi.imola.lab2.exercises.decoration;

import ro.ubb.dezsi.imola.lab2.exercises.Car;

public class DecoratorMain {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car price: "+ car.getPrice());
        CoolCar coolCar = new CoolCar(car);
        Nos carWithNos = new Nos(coolCar);
        System.out.println("Car with nos price: "+ carWithNos.getPrice());
        FlashyLights carWithFlashyLightsAndNos = new FlashyLights(carWithNos);
        System.out.println("Car with flashy lights and nos price: "+ carWithFlashyLightsAndNos.getPrice());
    }
}
