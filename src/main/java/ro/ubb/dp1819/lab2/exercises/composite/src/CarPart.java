import java.util.Random;

public class CarPart implements CarComponent{

    @Override
    public int price() {
        Random rnd  = new Random();
        int p = rnd.nextInt(50);
        System.out.println("This part costs "+p);
        return p;
    }
}
