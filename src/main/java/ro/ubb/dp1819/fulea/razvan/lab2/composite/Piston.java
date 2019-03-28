package ro.ubb.dp1819.fulea.razvan.lab2.composite;

public class Piston extends PriceComponent {

    public Piston(){
        super("Piston");
    }

    @Override
    Integer getPrice() {
        return 25;
    }
}
