package ro.ubb.dezsi.imola.lab2.exercises.component;

public class Chassis extends CarComponentWithType {
    public Chassis(String type) {
        super(type);
    }

    @Override
    public String getString() {
        return "Chassis: "+super.getType();
    }

}
