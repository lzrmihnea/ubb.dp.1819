package Bridge.abstraction;

import Bridge.service.CarCreationService;

public abstract class CarPark {
    protected CarCreationService service;

    public CarPark(CarCreationService service){
        this.service = service;
    }

    public abstract void buyCar();
}
