package ro.ubb.dp1819.fulea.razvan.lab1;

import ro.ubb.dp1819.fulea.razvan.lab1.builder.CoffeeBuilderMain;
import ro.ubb.dp1819.fulea.razvan.lab1.encapsulation.EncapsulationMain;
import ro.ubb.dp1819.fulea.razvan.lab1.factory.CoffeeFactoryMain;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n======= Encapsulation =======");
        EncapsulationMain.run();
        System.out.println("======= Encapsulation =======\n");

        System.out.println("\n======= Factory =======");
        CoffeeFactoryMain.run();
        System.out.println("======= Factory =======\n");

        System.out.println("\n======= Builder =======");
        CoffeeBuilderMain.run();
        System.out.println("======= Builder =======\n");
    }

}
