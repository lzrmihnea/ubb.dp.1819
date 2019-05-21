import java.util.ArrayList;
import java.util.List;

class Client {
    public static void main(final String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new ManufacturedCar("summer", "titanium", "diesel", "black",
                new DrawingApi1()));
        carList.add(new ManufacturedCar("winter", "aluminium", "electric","blue",
                new DrawingApi2()));
        for (Car car : carList) {
            car.assemble();
        }
    }
}