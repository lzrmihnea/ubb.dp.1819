package ro.ubb.dp1819.lab1.exercises.entity;

public class Espresso extends Drinkable {

    public static class EspressoBuilder extends AbstractBuilder{
        private Drinkable coffee = new Espresso();

        @Override
        public AbstractBuilder setNoCupsWater(Integer no){
            this.coffee.setWaterCups(no);
            return this;
        }

        @Override
        public AbstractBuilder setNoCupsCoffee(Double no) {
            this.coffee.setCoffeeCups(no);
            return this;
        }

        @Override
        public AbstractBuilder coffeeType(String type) {
            this.coffee.setCoffeeType(type);
            return this;
        }

        @Override
        public AbstractBuilder extraIngredients(String ingredients) {
            this.coffee.setExtraIngredient(ingredients);
            return this;
        }

        @Override
        public Drinkable build() {
            return this.coffee;
        }
    }

    protected Espresso(){
    }

    @Override
    protected void setWaterCups(Integer nr) {
        this.noCupsWater = nr;
    }

    @Override
    protected void setCoffeeCups(Double nr) {
        this.noCoffeeCups = nr;
    }

    @Override
    protected void setCoffeeType(String type) {
        this.type = type;
    }

    @Override
    protected void setExtraIngredient(String extra) {
        this.extraIngredients = this.extraIngredients + " + " + extra;
    }

    @Override
    public String getCoffee() {
        return getString();
    }
}
