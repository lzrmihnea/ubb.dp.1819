package ro.ubb.dp1819.fulea.razvan.lab2.adapter;

import java.io.IOException;

public class AdapterMain {

    public static void run(){
        String filename = "src/main/java/ro/ubb/dp1819/fulea/razvan/lab2/adapter/car.txt";
        IReadCarService readCarService = new ReadCarServiceAdapter();
        try {
            CarParts carParts = readCarService.readCar(filename);
            System.out.println("Read car parts: " + carParts);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
