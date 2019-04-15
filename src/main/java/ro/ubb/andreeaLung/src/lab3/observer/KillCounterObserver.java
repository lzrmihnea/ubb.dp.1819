package lab3.observer;

public class KillCounterObserver implements Observer {
    private static Integer kills=0;

    public KillCounterObserver() {
    }

    @Override
    public void update() {
        kills++;
        System.out.println("Number of kills right now: " + kills.toString());
    }
}
