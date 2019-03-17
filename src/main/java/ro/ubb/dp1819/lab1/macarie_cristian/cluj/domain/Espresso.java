package ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain;

public class Espresso extends Coffee {

    public Espresso(Double waterCups, Double roastedCoffeeBeanCups) {
        super(waterCups, roastedCoffeeBeanCups);
    }

    @Override
    public String toString() {
        return "Espresso{" +
                super.toString() +
                "}";
    }

    @Override
    public void showContent() {
        System.out.println(this.toString());
    }

    public static Espresso.EspressoBuilder builder() {return new EspressoBuilder();}

    public static class EspressoBuilder extends CoffeeBuilder<EspressoBuilder> {

        public Espresso build() {
            return new Espresso(this.waterCups, this.roastedCoffeeBeanCups);
        }

        @Override
        public EspressoBuilder self() {
            return this;
        }

    }

}
