package ro.ubb.dp1819.lab2.exercises.component;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class Engine implements CarComponent {
    private String engine;
    private Long price;

    public Engine(String engine) {
        this.engine = engine.toLowerCase();
    }

    @Override
    public void assignPrice() {
        switch (this.engine){
            case "electric":
                this.price = 500L;
                break;
            case "diesel":
                this.price = 100L;
                break;
            case "gpl":
                this.price = 50L;
                break;
        }
    }

    @Override
    public String getComponent() {
        return engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
