package Decorator.carComponents;

import Proxy.CarPriceable;

public interface CarComponent extends CarPriceable {
    String getType();
}
