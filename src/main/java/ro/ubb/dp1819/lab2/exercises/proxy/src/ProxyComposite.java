import java.util.List;

public class ProxyComposite implements Composite {

    private List <CarComponent> components;
    ProxyComposite(List<CarComponent> components){
        this.components = components;
    }
    private int price() {
        int total=0;
        for(CarComponent carComponent:components)
            total+= carComponent.price();
        return total;
    }

    @Override
    public void printAll() {
        for(CarComponent carComponent:components)
            System.out.println(carComponent);
        System.out.println("Total: "+price());
    }
}
