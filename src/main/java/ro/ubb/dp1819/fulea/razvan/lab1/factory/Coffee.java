package ro.ubb.dp1819.fulea.razvan.lab1.factory;

abstract class ICoffee {
    protected CoffeeIngredients ingredients;

    ICoffee(){}

    ICoffee(CoffeeIngredients ingredients){
        this.ingredients = ingredients;
    }

    abstract void drink();

}

class Espresso extends ICoffee{

    Espresso(CoffeeIngredients ingredients) {
        super(ingredients);
    }

    @Override
    public void drink() {
        System.out.println("Drinking espresso: " + ingredients);
    }

}

class Cappuccino extends  ICoffee{

    public Cappuccino(CoffeeIngredients ingredients) {
        super(ingredients);
    }

    @Override
    public void drink() {
        System.out.println("Drinking cappuccino: " + ingredients);
    }

}

class Americano extends ICoffee{

    public Americano(CoffeeIngredients ingredients) {
        super(ingredients);
    }

    @Override
    public void drink() {
        System.out.println("Drinking americano: " + ingredients);
    }

}

class Morningstart extends ICoffee{

    public Morningstart(CoffeeIngredients ingredients) {
        super(ingredients);
    }

    @Override
    public void drink() {
        System.out.println("Drinking morningstart: " + ingredients);
    }

}