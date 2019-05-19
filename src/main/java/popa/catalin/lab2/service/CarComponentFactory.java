package popa.catalin.lab2.service;

import popa.catalin.lab2.CarException;
import popa.catalin.lab2.domain.component.*;

public class CarComponentFactory {
    public AbstractCarComponent createNewComponent(String type)
    {
        AbstractCarComponent component;
        switch (type) {
            case "chassis":
                component = new Chassis();
                break;
            case "engine":
                component = new Engine();
                break;
            case "paint":
                component = new Paint();
                break;
            case "wheel":
                component = new Wheel();
                break;
            default:
                throw new CarException("Invalid car part name boii");
        }
        return component;
    }
}
