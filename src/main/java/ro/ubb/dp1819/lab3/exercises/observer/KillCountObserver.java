package ro.ubb.dp1819.lab3.exercises.observer;

import ro.ubb.dp1819.lab3.exercises.mediator.BoardMediator;

public class KillCountObserver implements Observer {
    private BoardMediator boardMediator;

    public KillCountObserver(BoardMediator boardMediator){
        this.boardMediator = boardMediator;
        this.boardMediator.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Kills: " + this.boardMediator.getBoardMap().entrySet().stream()
                .filter(e-> !e.getValue().isAlive())
                .count());
    }
}
