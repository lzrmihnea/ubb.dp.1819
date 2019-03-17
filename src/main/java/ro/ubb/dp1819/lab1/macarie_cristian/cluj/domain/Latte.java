package ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain;

public class Latte extends Coffee{
    private Double milk;

    public Latte(Double waterCups, Double roastedCoffeeBeanCups, Double milk) {
        super(waterCups, roastedCoffeeBeanCups);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Latte{" +
                super.toString() +
                ", milk=" + milk +
                "}";
    }

    @Override
    public void showContent() {
        System.out.println(this.toString());
    }

    public static Latte.LatteBuilder builder() {return new LatteBuilder();}

    public static class LatteBuilder extends CoffeeBuilder<LatteBuilder> {
        private Double milk;

        public LatteBuilder milk(Double milk) {
            this.milk = milk;
            return self();
        }

        public Latte build() {
            return new Latte(this.waterCups, this.roastedCoffeeBeanCups, this.milk);
        }

        @Override
        public LatteBuilder self() {
            return this;
        }

    }
}
