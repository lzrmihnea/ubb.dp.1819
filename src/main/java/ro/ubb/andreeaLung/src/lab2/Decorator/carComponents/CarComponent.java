package lab2.Decorator.carComponents;

import lab2.Proxy.CarPriceable;

public interface CarComponent extends CarPriceable {
    String getType();
}
