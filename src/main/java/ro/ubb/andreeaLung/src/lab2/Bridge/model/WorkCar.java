package lab2.Bridge.model;

import java.util.List;

public class WorkCar extends Car {
    private Integer employeeId;

    public WorkCar(List<Wheel> wheels, Chassis chassis, Engine engine, Paint paint, Integer employeeId) {
        super(wheels, chassis, engine, paint);
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "WorkCar{" + super.toString() +
                "employeeId=" + employeeId +
                '}';
    }
}
