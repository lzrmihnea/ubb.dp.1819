abstract class Car {
    AssembleApi assembleApi;

    Car(AssembleApi assembleApi) {
        this.assembleApi = assembleApi;
    }
    abstract void assemble(); // low-level
}

class ManufacturedCar extends Car {
    private String wheels, chassis, engine, paint;
    public ManufacturedCar(String wheels, String chassis, String engine, String paint,
                           AssembleApi assembleApi) {
        super(assembleApi);
        this.wheels = wheels;
        this.chassis = chassis;
        this.engine = engine;
        this.paint = paint;
    }

    public void assemble() {
        assembleApi.assemble(wheels, chassis, engine, paint);
    }

}