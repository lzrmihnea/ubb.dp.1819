package ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain;

public class Cappuccino extends Coffee {
    private Double milk;
    private Double chocolate;

    public Cappuccino(Double waterCups, Double roastedCoffeeBeanCups, Double milk, Double chocolate) {
        super(waterCups, roastedCoffeeBeanCups);
        this.milk = milk;
        this.chocolate = chocolate;
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                super.toString() +
                ", milk=" + milk +
                ", chocolate=" + chocolate +
                "}";
    }

    @Override
    public void showContent() {
        System.out.println(this.toString());
    }

    public static Cappuccino.CappuccinoBuilder builder() {return new CappuccinoBuilder();}

    public static class CappuccinoBuilder extends Coffee.CoffeeBuilder<CappuccinoBuilder> {
        private Double milk;
        private Double chocolate;

        public CappuccinoBuilder milk(Double milk) {
            this.milk = milk;
            return self();
        }

        public CappuccinoBuilder chocolate(Double chocolate) {
            this.chocolate = chocolate;
            return self();
        }

        public Cappuccino build() {
            return new Cappuccino(this.waterCups, this.roastedCoffeeBeanCups, this.milk, this.chocolate);
        }

        @Override
        public CappuccinoBuilder self() {
            return this;
        }

    }
}
