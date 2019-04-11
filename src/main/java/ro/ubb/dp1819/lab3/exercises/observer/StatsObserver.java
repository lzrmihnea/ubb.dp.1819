package ro.ubb.dp1819.lab3.exercises.observer;

import ro.ubb.dp1819.lab3.exercises.mediator.BoardMediator;
import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;

public class StatsObserver implements Observer {
    private BoardMediator boardMediator;

    public StatsObserver(BoardMediator boardMediator){
        this.boardMediator = boardMediator;
        this.boardMediator.attach(this);
    }

    @Override
    public void update() {
        Long white = this.boardMediator.getBoardMap().entrySet().stream()
                .filter(e -> e.getValue().getColor() == ChessPiece.ChessPieceColor.WHITE && e.getValue().isAlive())
                .count();
        Long black = this.boardMediator.getBoardMap().entrySet().stream()
                .filter(e -> e.getValue().getColor() == ChessPiece.ChessPieceColor.BLACK && e.getValue().isAlive())
                .count();
        System.out.println("White pieces: " + white + "\n" + "Black pieces: " + black +"\n");
    }
}
