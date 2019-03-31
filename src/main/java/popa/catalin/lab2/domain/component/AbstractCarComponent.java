package popa.catalin.lab2.domain.component;

import popa.catalin.lab2.domain.CarPriceable;

public class AbstractCarComponent implements CarPriceable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " " + type;
    }

    @Override
    public Long getPrice() {
        return 0L;
    }
}
