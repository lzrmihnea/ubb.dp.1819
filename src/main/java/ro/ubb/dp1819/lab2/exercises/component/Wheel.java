package ro.ubb.dp1819.lab2.exercises.component;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class Wheel implements CarComponent {
    private String type;
    private Long price;
    private Integer noWheels;

    public Wheel(String type,Integer noWheels){
        this.type = type;
        this.noWheels = noWheels;
    }

    @Override
    public void assignPrice() {
        switch (type){
            case "summer":
                this.price = 400L;
                break;
            case "winter":
                this.price = 356L;
                break;
        }
    }

    @Override
    public String getComponent() {
        return noWheels + " " + type;
    }

    public String getTypes() {
        return type;
    }

    public void setTypes(String type) {
        this.type = type;
    }

    public Integer getNoWheels() {
        return noWheels;
    }

    public void setNoWheels(Integer noWheels) {
        this.noWheels = noWheels;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
