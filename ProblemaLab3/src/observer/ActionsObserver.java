package observer;

import pieces.ChessPiece;
import pieces.Position;

public class ActionsObserver implements Observer {
    private String identifier;

    public ActionsObserver(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public void updateObserver(ChessPiece chessPiece, String action, Position newPosition) {
        System.out.println(identifier + " => " + action.toUpperCase() + ": ");
        System.out.println("Old position: " + chessPiece.getPosition());
        System.out.println("New position: " + newPosition);

    }
}
