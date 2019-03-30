package ro.ubb.dezsi.imola.lab2.exercises.component;

public class Engine extends CarComponentWithType {
    public Engine(String type) {
        super(type);
    }

    @Override
    public String getString() {
        return "Engine: "+super.getType();
    }

}
