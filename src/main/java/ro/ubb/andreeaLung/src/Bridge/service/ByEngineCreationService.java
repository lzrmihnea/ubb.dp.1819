package Bridge.service;

import Bridge.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class ByEngineCreationService extends CarCreationService {
    @Override
    public Car createCar(List<String> carInputComponents) {
        List<Wheel> wheels = new ArrayList<>();
        for(int i=0;i<4;i++)
            wheels.add(new Wheel(carInputComponents.get(0)));
        Chassis chassis = new Chassis(carInputComponents.get(1));
        Engine engine = new Engine(carInputComponents.get(2));
        Paint paint = new Paint(carInputComponents.get(3));

        if (engine.getType().equals("electric"))
            return new WorkCar(wheels,chassis,engine,paint,1463);
        else
            return new FamilyCar(wheels,chassis,engine,paint,4);
    }
}
