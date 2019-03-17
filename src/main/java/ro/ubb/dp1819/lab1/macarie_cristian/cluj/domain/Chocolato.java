package ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain;

public class Chocolato extends Coffee {
    private Double chocolate;

    public Chocolato(Double waterCups, Double roastedCoffeeBeanCups, Double chocolate) {
        super(waterCups, roastedCoffeeBeanCups);
        this.chocolate = chocolate;
    }

    @Override
    public String toString() {
        return "Chocolato{" +
                super.toString() +
                ", chocolate=" + chocolate +
                "}";
    }

    @Override
    public void showContent() {
        System.out.println(this.toString());
    }

    public static Chocolato.ChocolatoBuilder builder() {return new ChocolatoBuilder();}

    public static class ChocolatoBuilder extends Coffee.CoffeeBuilder<ChocolatoBuilder> {
        private Double chocolate;

        public ChocolatoBuilder chocolate(Double chocolate) {
            this.chocolate = chocolate;
            return self();
        }

        public Chocolato build() {
            return new Chocolato(this.waterCups, this.roastedCoffeeBeanCups, this.chocolate);
        }

        @Override
        public ChocolatoBuilder self() {
            return this;
        }

    }
}
