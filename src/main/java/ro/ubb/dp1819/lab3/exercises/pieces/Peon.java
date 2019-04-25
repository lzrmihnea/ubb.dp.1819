package ro.ubb.dp1819.lab3.exercises.pieces;

public class Peon extends ChessPiece {
    public Peon(int vertPos, int horizPos, boolean isAlive, ChessPieceColor color) {
        super(new Position(vertPos, horizPos), isAlive, color);
    }
}
