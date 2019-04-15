package lab2.Bridge;

import lab2.Bridge.abstraction.CarPark;
import lab2.Bridge.abstraction.CarParkCheap;
import lab2.Bridge.abstraction.CarParkExpensive;
import lab2.Bridge.service.ByColorCreationService;
import lab2.Bridge.service.ByEngineCreationService;
import lab2.Bridge.service.CarCreationService;

public class BridgeClient {

    public static void main(String[] args) {
        // lab2.Bridge
        CarCreationService byEngineService = new ByEngineCreationService();
        CarCreationService byColorService = new ByColorCreationService();
        CarPark cheapCarPark = new CarParkCheap(byColorService);
        CarPark expensiveCarPark = new CarParkExpensive(byEngineService);

        cheapCarPark.buyCar();
        expensiveCarPark.buyCar();
    }
}
