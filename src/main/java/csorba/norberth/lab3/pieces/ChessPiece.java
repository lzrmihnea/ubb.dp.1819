package csorba.norberth.lab3.pieces;

import csorba.norberth.lab3.command.MovementCommand;

public abstract class ChessPiece {

    private Position crtPosition;
    private boolean alive = true;
    private final ChessPieceColor color;

    ChessPiece(ChessPieceColor color, Position position) {
        this.color = color;
        this.crtPosition = position;
    }


    public Position getCurrentPosition() {
        return this.crtPosition;
    }

    public void setCrtPosition(Position pos) {
        this.crtPosition = pos;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public ChessPieceColor getColor() {
        return this.color;
    }

    public abstract MovementCommand getPossibleMove();
}
