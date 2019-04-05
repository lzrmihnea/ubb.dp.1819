package ro.ubb.dp1819.lab2.structural.adapter;

class Adapter implements ITarget {
    Adaptee adaptee = new Adaptee();

    public void methodA() {
        adaptee.methodB();
    }
}
