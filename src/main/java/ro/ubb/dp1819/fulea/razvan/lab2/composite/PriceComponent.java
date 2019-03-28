package ro.ubb.dp1819.fulea.razvan.lab2.composite;

public abstract class PriceComponent {
    protected String name;

    public PriceComponent(String name){
        this.name = name;
    }

    abstract Integer getPrice();

    @Override
    public String toString() {
        return name + "{price=" + getPrice() + "}";
    }
}
