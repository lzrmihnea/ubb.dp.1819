import java.util.Random;

public class CarPart implements CarComponent{
    private String name;

    CarPart(String name) {
        this.name = name;
    }

    @Override
    public int price() {
        Random rnd  = new Random();
        int p = rnd.nextInt(50);
        return p;
    }

    @Override
    public String toString() {
        return name+" ";
    }
}
