package lab2.Bridge.service;

import lab2.Bridge.model.*;

import java.util.ArrayList;
import java.util.List;

public class ByColorCreationService extends CarCreationService {
    @Override
    public Car createCar(List<String> carInputComponents) {
        List<Wheel> wheels = new ArrayList<>();
        for(int i=0;i<4;i++)
            wheels.add(new Wheel(carInputComponents.get(0)));
        Chassis chassis = new Chassis(carInputComponents.get(1));
        Engine engine = new Engine(carInputComponents.get(2));
        Paint paint = new Paint(carInputComponents.get(3));

        if (paint.getType().equals("black"))
            return new WorkCar(wheels,chassis,engine,paint,2111);
        else
            return new FamilyCar(wheels,chassis,engine,paint,2);
    }
}
