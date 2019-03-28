package ro.ubb.dp1819.lab2.exercises.component;

import ro.ubb.dp1819.lab2.exercises.CarPriceable;

public class Chassis implements CarComponent {
    private String chassis;
    private Long price;

    public Chassis(String chassis) {
        this.chassis = chassis.toLowerCase();
        // this.assignPrice();
    }

    @Override
    public void assignPrice() {
        switch (this.chassis){
            case "titanium":
                this.price = 80L;
                break;
            case "aluminium":
                this.price = 10L;
                break;
            case "vibranium":
                this.price = 200L;
                break;
            case "adamantium":
                this.price = 500L;
                break;
        }
    }

    @Override
    public String getComponent() {
        return chassis;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
