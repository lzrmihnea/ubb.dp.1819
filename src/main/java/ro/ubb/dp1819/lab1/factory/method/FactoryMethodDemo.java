package ro.ubb.dp1819.lab1.factory.method;

public class FactoryMethodDemo {

    private static CarFactory carFactory = new DaciaMioveniFactory();

    public static void main(String[] args) {
        Dacia createdCar = carFactory.createCar("SANDERO");

        System.out.println(createdCar.getClass().getSimpleName()
                + " : "
                + createdCar.startCar());
    }

}