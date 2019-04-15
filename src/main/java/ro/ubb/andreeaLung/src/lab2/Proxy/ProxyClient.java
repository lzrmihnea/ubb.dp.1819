package lab2.Proxy;

import lab2.Bridge.service.ByEngineCreationService;
import lab2.Bridge.service.CarCreationService;

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
