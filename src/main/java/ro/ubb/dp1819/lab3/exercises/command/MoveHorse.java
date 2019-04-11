package ro.ubb.dp1819.lab3.exercises.command;

import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;
import ro.ubb.dp1819.lab3.exercises.pieces.Position;

public class MoveHorse implements MovementCommand {
    private HorseDir direction;

    public MoveHorse(HorseDir direction){
        this.direction = direction;
    }

    public enum HorseDir {
        TopRight,
        TopLeft,
        BottomRight,
        BottomLeft,
        LeftUp,
        LeftDown,
        RightUp,
        RightDown,
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        switch (this.direction){
            case BottomRight:
                piece.setPosition(new Position(piece.getPosition().getVertPos() + 2,
                        piece.getPosition().getHorizPos() + 1));
                break;
            case TopRight:
                piece.setPosition(new Position(piece.getPosition().getVertPos() - 2,
                        piece.getPosition().getHorizPos() + 1));
                break;
            case BottomLeft:
                piece.setPosition(new Position(piece.getPosition().getVertPos() + 2,
                        piece.getPosition().getHorizPos() - 1));
                break;
            case TopLeft:
                piece.setPosition(new Position(piece.getPosition().getVertPos() - 2,
                        piece.getPosition().getHorizPos() - 1));
                break;
            case LeftUp:
                piece.setPosition(new Position(piece.getPosition().getVertPos() - 1,
                        piece.getPosition().getHorizPos() - 2));
                break;
            case RightUp:
                piece.setPosition(new Position(piece.getPosition().getVertPos() - 1,
                        piece.getPosition().getHorizPos() + 2));
                break;
            case LeftDown:
                piece.setPosition(new Position(piece.getPosition().getVertPos() + 1,
                        piece.getPosition().getHorizPos() - 2));
                break;
            case RightDown:
                piece.setPosition(new Position(piece.getPosition().getVertPos() + 1,
                        piece.getPosition().getHorizPos() + 2));
                break;
        }
    }
}
