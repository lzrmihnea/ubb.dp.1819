package ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain;

public abstract class Coffee {
    private Double waterCups;
    private Double roastedCoffeeBeanCups;

    protected Coffee(Double waterCups, Double roastedCoffeeBeanCups) {
        this.waterCups = waterCups;
        this.roastedCoffeeBeanCups = roastedCoffeeBeanCups;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "waterCups=" + waterCups +
                ", roastedCoffeeBeanCups=" + roastedCoffeeBeanCups +
                '}';
    }

    public abstract void showContent();

    protected static abstract class CoffeeBuilder<T extends CoffeeBuilder> {
        protected Double waterCups;
        protected Double roastedCoffeeBeanCups;

        public T waterCups(Double waterCups) {
            this.waterCups = waterCups;
            return self();
        }

        public T roastedCoffeeBeanCups(Double roastedCoffeeBeanCups) {
            this.roastedCoffeeBeanCups = roastedCoffeeBeanCups;
            return self();
        }

        public abstract Coffee build();
        public abstract T self();
    }
}
