interface AssembleApi {
    void assemble(String wheels, String chassis, String engine, String paint);
}

class DrawingApi1 implements AssembleApi {
    public void assemble(String wheels, String chassis, String engine, String paint) {
        System.out.printf("API1.car with 4 %s wheels, %s chassis, %s engine and %s paint.\n", wheels,
                chassis, engine, paint);
    }
}

class DrawingApi2 implements AssembleApi {
    public void assemble(String wheels, String chassis, String engine, String paint) {
        System.out.printf("API2.car with 4 %s wheels, %s chassis, %s engine and %s paint.\n", wheels,
                chassis, engine, paint);
    }
}
