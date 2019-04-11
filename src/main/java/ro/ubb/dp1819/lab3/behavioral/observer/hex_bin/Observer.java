package ro.ubb.dp1819.lab3.behavioral.observer.hex_bin;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
