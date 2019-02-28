package ro.ubb.dp1819.lab1.factory.method;

public interface Dacia {
    String ID_FOR_LOGAN = "LOGAN";
    String ID_FOR_SANDERO = "SANDERO";
    String ID_FOR_DUSTER = "DUSTER";

    String startCar();
}

class Sandero implements Dacia {
    @Override
    public String startCar() {
        return "Running like a BMW";
    }
}

class Logan implements Dacia {
    @Override
    public String startCar() {
        return "Running like a Tesla";
    }
}

class Duster implements Dacia {
    @Override
    public String startCar() {
        return "Running like an SUV";
    }
}

class _1310 implements Dacia {
    @Override
    public String startCar() {
        return "No longer running";
    }
}