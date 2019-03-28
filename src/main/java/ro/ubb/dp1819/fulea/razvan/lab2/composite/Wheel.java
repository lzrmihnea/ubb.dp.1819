package ro.ubb.dp1819.fulea.razvan.lab2.composite;

public class Wheel extends PriceComponent {

    public Wheel() {
        super("Wheel");
    }

    @Override
    Integer getPrice() {
        return 100;
    }
}
