package ro.ubb.dp1819.lab3.alonso.lucia.pieces;

public class Bishop extends ChessPiece {
    public Bishop(int vertPos, int horizPos, boolean isAlive, ChessPieceColor color) {
        super(new Position(vertPos, horizPos), isAlive, color);
    }
}
