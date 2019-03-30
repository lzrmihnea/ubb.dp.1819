package ro.ubb.dezsi.imola.lab2.exercises.component;

public class Wheel extends CarComponentWithType {
    public Wheel(String type) {
        super(type);
    }
    @Override
    public String getString() {
        return "Wheel: "+super.getType();
    }

}
