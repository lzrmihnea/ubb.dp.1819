import java.util.ArrayList;
import java.util.List;

public class CarComposite implements CarComponent, Composite {

    private List<CarComponent> components = new ArrayList<>();

    public void add(CarComponent carComponent){
        this.components.add(carComponent);
    }

    public void remove(CarComponent carComponent){
        this.components.remove(carComponent);
    }

    public List<CarComponent> getComponents() {
        return components;
    }

    @Override
    public int price() {
        int total=0;
        for(CarComponent c : components)
            total+=c.price();
        return total;
    }

    @Override
    public void printAll(){
        for(CarComponent c: components)
            System.out.println(c);
    }

    @Override
    public String toString() {
        String s="";
        for(CarComponent c: components)
            s+=c.toString();
        return s;
    }
}
