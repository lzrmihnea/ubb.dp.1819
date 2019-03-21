package ro.ubb.dp1819.fulea.razvan.lab1.builder;


public class CoffeeBuilderMain {

    public static void run(){
        Coffee coffee = new Coffee.CoffeeBuilder()
                .waterCups(5)
                .beanCups(0.5)
                .milk(1)
                .build();
        System.out.println(coffee);
    }

}
