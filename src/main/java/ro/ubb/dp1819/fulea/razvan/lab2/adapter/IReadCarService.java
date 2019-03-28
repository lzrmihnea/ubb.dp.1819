package ro.ubb.dp1819.fulea.razvan.lab2.adapter;

import java.io.IOException;

public interface IReadCarService {

    public CarParts readCar(String filename) throws IOException;

}
