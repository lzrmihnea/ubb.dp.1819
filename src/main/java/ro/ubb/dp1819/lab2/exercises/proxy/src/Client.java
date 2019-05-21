public class Client {
    public static void main(String[] args) {
        CarPart c1 = new CarPart("engine");
        CarPart c2 = new CarPart("wheels");
        CarPart c3 = new CarPart("chassis");
        CarPart c4 = new CarPart("suspensions");
        CarPart c5 = new CarPart("xenon headlights");

        CarComposite composite1 = new CarComposite();
        CarComposite composite2 = new CarComposite();
        CarComposite composite3 = new CarComposite();

        composite1.add(c1);
        composite1.add(c2);
        composite1.add(c3);

        composite2.add(c4);
        composite2.add(c5);

        composite3.add(composite1);
        composite3.add(composite2);

        ProxyComposite composite = new ProxyComposite(composite3.getComponents());

        composite.printAll();
    }
}
