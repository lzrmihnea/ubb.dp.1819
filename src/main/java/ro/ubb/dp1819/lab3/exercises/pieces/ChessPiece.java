package ro.ubb.dp1819.lab3.exercises.pieces;

public abstract class ChessPiece {

    private Position position;
    private boolean isAlive;
    private ChessPieceColor color;

    public ChessPiece(Position pos, boolean isAlive, ChessPieceColor color) {
        this.position = pos;
        this.isAlive = isAlive;
        this.color = color;
    }

    enum ChessPieceColor{
        WHITE,
        BLACK;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public ChessPieceColor getColor() {
        return color;
    }

    public void setColor(ChessPieceColor color) {
        this.color = color;
    }
}
