package ro.ubb.dp1819.lab1.creational.factory.method;

public class DaciaMioveniFactory implements CarFactory {

    @Override
    public Dacia createCar(String whichCar) {
        if (whichCar == null
                || whichCar.isEmpty()
                || whichCar.trim().isEmpty()) {
            return new _1310();
        }

        switch (whichCar.toUpperCase().trim()) {
            case Dacia.ID_FOR_LOGAN:
                return new Logan();
            case Dacia.ID_FOR_SANDERO:
                return new Sandero();
            case Dacia.ID_FOR_DUSTER:
                return new Duster();
            default:
                return new _1310();
        }
    }

}
