package ro.ubb.dp1819.fulea.razvan.lab2.composite;

public class CompositeMain {

    public static void run() {
        CompositePriceComponent car = new CompositePriceComponent("car");

        CompositePriceComponent engine = new CompositePriceComponent("engine");
        PriceComponent p1 = new Piston();
        PriceComponent p2 = new Piston();
        PriceComponent p3 = new Piston();
        engine.add(p1); engine.add(p2); engine.add(p3);

        PriceComponent w1 = new Wheel();
        PriceComponent w2 = new Wheel();
        PriceComponent w3 = new Wheel();
        PriceComponent w4 = new Wheel();

        car.add(engine);
        car.add(w1); car.add(w2); car.add(w3); car.add(w4);

        System.out.println(car.toString());
        System.out.println(car.getPrice());
    }

}
