package ro.ubb.dp1819.fulea.razvan.lab2.bridge.race;

import ro.ubb.dp1819.fulea.razvan.lab2.bridge.service.CarCreationService;

public abstract class Race {
    protected CarCreationService service;

    public Race(CarCreationService service){
        this.service = service;
    }

    public abstract void start();

}
