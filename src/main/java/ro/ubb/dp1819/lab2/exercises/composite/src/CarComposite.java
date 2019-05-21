import java.util.ArrayList;
import java.util.List;

public class CarComposite implements CarComponent {

    private List<CarComponent> components = new ArrayList<>();

    public void add(CarComponent carComponent){
        this.components.add(carComponent);
    }

    public void remove(CarComponent carComponent){
        this.components.remove(carComponent);
    }
    @Override
    public int price() {
        int total=0;
        for(CarComponent c : components)
            total+=c.price();
        System.out.println("This composite has the total of "+total);
        return total;
    }
}
