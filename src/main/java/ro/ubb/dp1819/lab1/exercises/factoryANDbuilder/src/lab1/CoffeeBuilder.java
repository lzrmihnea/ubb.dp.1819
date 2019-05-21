package lab1;

class CoffeeBuilder {
    private String coffee = "";
    public CupBuilder cup(Integer cups){
        CupBuilder cupBuilder = new CupBuilder();
        cupBuilder.setStr(cups.toString());
        return cupBuilder;
    }
    protected void setPrevStr(String prevStr) { this.coffee = prevStr;}
    protected void setStr(String newStr) {this.coffee  = this.coffee +newStr+ template();}
    protected String getStr() { return this.coffee; }
    protected String template() {
        return " ";
    }
    public String build() {return this.coffee;}

    @Override
    public String toString() {
        return this.coffee;
    }

}

class CupBuilder extends CoffeeBuilder{
    public CoffeeBeanBuilder beans(Float beans){
        CoffeeBeanBuilder coffeeBeanBuilder = new CoffeeBeanBuilder();
        coffeeBeanBuilder.setPrevStr(this.getStr());
        coffeeBeanBuilder.setStr(beans.toString());
        return coffeeBeanBuilder;
    }

    @Override
    protected String template() {
        return " cups water + ";
    }
}

class CoffeeBeanBuilder extends CoffeeBuilder{
    public IngredientBuilder ingredient(String ingr){
        IngredientBuilder ingredientBuilder = new IngredientBuilder();
        ingredientBuilder.setPrevStr(this.getStr());
        ingredientBuilder.setStr(" + "+ingr);
        return ingredientBuilder;
    }
    @Override
    protected String template() {
        return " cups coffee-beans roasted";
    }
}

class IngredientBuilder extends CoffeeBuilder{
    public String build() { return this.toString(); }

    @Override
    protected String template() {
        return "";
    }
}

