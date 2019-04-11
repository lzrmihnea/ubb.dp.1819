package ro.ubb.dp1819.lab3.exercises.observer;

import ro.ubb.dp1819.lab3.exercises.mediator.BoardMediator;
import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;

public class PrintObserver implements Observer {
    private BoardMediator boardMediator;

    public PrintObserver(BoardMediator boardMediator){
        this.boardMediator = boardMediator;
        this.boardMediator.attach(this);
    }

    @Override
    public void update() {
        int ints[][] = new int[6][6];
        this.boardMediator.getBoardMap().entrySet().stream()
                .filter(e -> e.getValue().isAlive())
                .forEach(e -> { System.out.println(e.getValue().toString());
                if (e.getValue().getColor().equals(ChessPiece.ChessPieceColor.BLACK))
                    ints[e.getValue().getPosition().getVertPos()][e.getValue().getPosition().getHorizPos()] = 2;
                else
                    ints[e.getValue().getPosition().getVertPos()][e.getValue().getPosition().getHorizPos()] = 1;
                });

        for (int i = 1 ; i <  6; i++){
            for (int j = 1 ; j < 5; j++)
                System.out.print(ints[i][j] + " ");
            System.out.println();
        }
    }
}
