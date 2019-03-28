package ro.ubb.dp1819.lab2.structural.decorator.window;

abstract class WindowDecorator implements Window {
    protected Window windowToBeDecorated;

    WindowDecorator(Window decorate) {
        this.windowToBeDecorated = decorate;
    }

    @Override
    public void draw() {
        windowToBeDecorated.draw(); //Delegation
    }

    @Override
    public String getDescription() {
        //Delegation
        return windowToBeDecorated.getDescription();
    }
}

