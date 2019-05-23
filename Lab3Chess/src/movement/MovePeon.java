package movement;

import pieces.ChessPiece;
import pieces.Peon;
import pieces.Position;

public class MovePeon implements MovementCommand {
    private String direction;

    public MovePeon(String direction){
        this.direction = direction;
    }

    public Position getFuturePosition(ChessPiece piece){
        int jumpVal;
        if(piece.getColor() == ChessPiece.ChessPieceColor.BLACK){
            jumpVal = 1;
        } else {
            jumpVal = -1;
        }
        Position futurePos = null;
        switch (direction) {
            case "up":
                futurePos = new Position(piece.getPosition().getVertPos() + jumpVal, piece.getPosition().getHorizPos());
                break;
            case "up-right":
                futurePos = new Position(piece.getPosition().getVertPos() + jumpVal, piece.getPosition().getHorizPos() + jumpVal);
                break;
            case "up-left":
                futurePos = new Position(piece.getPosition().getVertPos() + jumpVal, piece.getPosition().getHorizPos() - jumpVal);
                break;
        }

        return futurePos;
    }

    @Override
    public void executeCommand(ChessPiece piece) {
        int jumpVal;
        if(piece.getColor() == ChessPiece.ChessPieceColor.BLACK){
            jumpVal = 1;
        } else {
            jumpVal = -1;
        }
        switch (direction) {
            case "up":
                piece.setPosition(new Position(piece.getPosition().getVertPos() + jumpVal, piece.getPosition().getHorizPos()));
                break;
            case "up-right":
                piece.setPosition(new Position(piece.getPosition().getVertPos() + jumpVal, piece.getPosition().getHorizPos() + jumpVal));
                break;
            case "up-left":
                piece.setPosition(new Position(piece.getPosition().getVertPos() + jumpVal, piece.getPosition().getHorizPos() - jumpVal));
                break;
        }
    }
}
