package Bridge;

import Bridge.abstraction.CarPark;
import Bridge.abstraction.CarParkCheap;
import Bridge.abstraction.CarParkExpensive;
import Bridge.service.ByColorCreationService;
import Bridge.service.ByEngineCreationService;
import Bridge.service.CarCreationService;

public class BridgeClient {

    public static void main(String[] args) {
        // Bridge
        CarCreationService byEngineService = new ByEngineCreationService();
        CarCreationService byColorService = new ByColorCreationService();
        CarPark cheapCarPark = new CarParkCheap(byColorService);
        CarPark expensiveCarPark = new CarParkExpensive(byEngineService);

        cheapCarPark.buyCar();
        expensiveCarPark.buyCar();
    }
}
