package ro.ubb.dezsi.imola.lab2.exercises.component;

public class Paint extends CarComponentWithType {
    public Paint(String type) {
        super(type);
    }

    @Override
    public String getString() {
        return "Paint: "+super.getType();
    }

}
