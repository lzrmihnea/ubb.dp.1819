package ro.ubb.dp1819.fulea.razvan.lab2;

import ro.ubb.dp1819.fulea.razvan.lab2.adapter.AdapterMain;
import ro.ubb.dp1819.fulea.razvan.lab2.bridge.BridgeMain;
import ro.ubb.dp1819.fulea.razvan.lab2.composite.CompositeMain;
import ro.ubb.dp1819.fulea.razvan.lab2.decorator.DecoratorPattern;
import ro.ubb.dp1819.fulea.razvan.lab2.proxy.ProxyMain;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n======= Adapter =======");
        AdapterMain.run();
        System.out.println("======= Adapter =======\n");

        System.out.println("\n======= Bridge =======");
        BridgeMain.run();
        System.out.println("======= Bridge =======\n");

        System.out.println("\n======= Composite =======");
        CompositeMain.run();
        System.out.println("======= Composite =======\n");

        System.out.println("\n======= Decorator =======");
        DecoratorPattern.run();
        System.out.println("======= Decorator=======\n");

        System.out.println("\n======= Proxy =======");
        ProxyMain.run();
        System.out.println("======= Proxy =======\n");
    }

}
