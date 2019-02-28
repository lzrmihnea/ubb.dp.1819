package ro.ubb.dp1819.lab1.factory.abstr;

interface IGUIFactory {
    public IButton createButton();
}

class WinFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }
}

class OSXFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
