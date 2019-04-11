package ro.ubb.dp1819.lab3.exercises.command;

import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;

public class MovePeon implements MovementCommand {
    private PeonDir peonDir;

    public MovePeon(PeonDir peonDir){
        this.peonDir = peonDir;
    }

    public enum PeonDir{
        Up,
        Down
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        switch (this.peonDir){
            case Up:
                piece.getPosition().setVertPos(piece.getPosition().getVertPos() + 1);
                break;
            case Down:
                piece.getPosition().setVertPos(piece.getPosition().getVertPos() - 1);
                break;
        }
    }
}
