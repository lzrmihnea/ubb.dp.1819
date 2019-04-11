package ro.ubb.dp1819.lab3.exercises.command;

import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;
import ro.ubb.dp1819.lab3.exercises.pieces.Position;

public class MoveBishop implements MovementCommand {

    private Integer length;
    private BishopDir bishopDir;

    public MoveBishop(Integer length, BishopDir direction){
        this.length = length;
        this.bishopDir = direction;
    }

    public enum BishopDir {
        UpRight,
        UpLeft,
        DownLeft,
        DownRight,
    }

    @Override
    public void executeCommand(ChessPiece piece) {
       switch(this.bishopDir){
           case UpLeft:
               while (this.length > 0){
                   piece.setPosition(new Position(piece.getPosition().getVertPos() - 1,
                           piece.getPosition().getHorizPos() - 1));
                   this.length--;
               }
               break;
           case DownLeft:
               while (this.length > 0){
                   piece.setPosition(new Position(piece.getPosition().getVertPos() + 1,
                           piece.getPosition().getHorizPos() - 1));
                   this.length--;
               }
               break;
           case UpRight:
               while (this.length > 0){
                   piece.setPosition(new Position(piece.getPosition().getVertPos() - 1,
                           piece.getPosition().getHorizPos() + 1));
                   this.length--;
               }
               break;
           case DownRight:
               while (this.length > 0){
                   piece.setPosition(new Position(piece.getPosition().getVertPos() + 1,
                           piece.getPosition().getHorizPos() + 1));
                   this.length--;
               }
               break;
       }
    }
}
