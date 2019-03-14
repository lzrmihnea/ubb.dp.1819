package ro.ubb.dp1819.exercises.entity;

public class LongBlack extends Coffee {

    private LongBlack(Ingredient water, Ingredient coffeeBeans) {
        super(water, coffeeBeans);
    }

    public static LongBlackBuilder builder() {
        return new LongBlackBuilder();
    }

    public static class LongBlackBuilder {

        private Ingredient water;
        private Ingredient coffeeBeans;

        private LongBlackBuilder() {
        }

        public LongBlackBuilder water(Ingredient water) {
            this.water = water;
            return this;
        }

        public LongBlackBuilder coffeeBeans(Ingredient coffeeBeans) {
            this.coffeeBeans = coffeeBeans;
            return this;
        }

        public LongBlack build() {
            return new LongBlack(water, coffeeBeans);
        }

    }
}
