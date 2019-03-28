package ro.ubb.dp1819.lab1.exercises.entity;

public class CoffeeBuilder {
    private Drinkable coffee;

    public Builder builder(String type){
        type = type.toLowerCase();
        Builder builder = new Builder();
        switch (type)
        {
            case "cappuccino":
                builder.setCoffee(new Cappuccino());
                break;
            case "americano":
                builder.setCoffee(new Americano());
                break;
            case "espresso":
                builder.setCoffee(new Espresso());
                break;
            case "latte":
                builder.setCoffee(new Latte());
                break;
        }
        return builder;
    }

    protected void setCoffee(Drinkable coffee) {this.coffee = coffee;}
    protected Drinkable getCoffee() {return this.coffee;}

}
