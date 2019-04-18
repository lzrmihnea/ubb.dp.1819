package ro.ubb.dezsi.imola.lab3.exercises.pieces;

import ro.ubb.dezsi.imola.lab3.exercises.mediator.BoardMediator;

public abstract class ChessPiece {

    private Position position;
    private boolean isAlive;
    private ChessPieceColor color;
    private BoardMediator med;

    public ChessPiece(Position pos, boolean isAlive, ChessPieceColor color, BoardMediator med) {
        this.position = pos;
        this.isAlive = isAlive;
        this.color = color;
        this.med = med;
    }

    public enum ChessPieceColor{
        WHITE,
        BLACK;
    }

    public BoardMediator getMediator() {return med;}

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
