package ro.ubb.dp1819.lab1.creational.factory.abstr;

interface IButton {
    void paint();
}

class WinButton implements IButton {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}

class OSXButton implements IButton {
    @Override
    public void paint() {
        System.out.println("OSXButton");
    }
}