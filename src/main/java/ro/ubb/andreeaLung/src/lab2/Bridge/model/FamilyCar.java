package lab2.Bridge.model;

import java.util.List;

public class FamilyCar extends Car {
    private Integer familyMembers;

    public FamilyCar(List<Wheel> wheels, Chassis chassis, Engine engine, Paint paint, Integer familyMembers) {
        super(wheels, chassis, engine, paint);
        this.familyMembers = familyMembers;
    }

    @Override
    public String toString() {
        return "FamilyCar{" + super.toString() +
                "familyMembers=" + familyMembers +
                '}';
    }
}
