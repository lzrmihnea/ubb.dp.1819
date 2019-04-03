package Proxy;

import Bridge.service.ByEngineCreationService;
import Bridge.service.CarCreationService;

import java.util.Arrays;
import java.util.List;

public class ProxyClient {
    public static void main(String[] args) {
        CarCreationService carCreationService = new ByEngineCreationService();
        CreateCarProxy carProxy = new CreateCarProxy(carCreationService);
        List<String> carParts = Arrays.asList("summer","titanium","diesel","red");
        carProxy.createCar(carParts);
    }
}
