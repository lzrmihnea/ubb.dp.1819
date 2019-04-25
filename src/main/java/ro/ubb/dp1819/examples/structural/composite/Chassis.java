package ro.ubb.dp1819.examples.structural.composite;

public class Chassis extends CompositeEquipment {
    public Chassis(String name, int power, int price) {
        super(name, power, price);
    }

    @Override
    public void diagnostic() {
        System.out.println("Chassis diagnostic!");
    }
}