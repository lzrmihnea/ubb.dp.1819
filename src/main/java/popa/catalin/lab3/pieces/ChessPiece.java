package popa.catalin.lab3.pieces;

import popa.catalin.lab3.Position;
import popa.catalin.lab3.command.MovementCommand;
import popa.catalin.lab3.mediator.BoardMediator;

public abstract class ChessPiece {
    private Position position;
    private boolean isAlive;
    private ChessPieceColor color;
    private BoardMediator boardMediator;
    private MovementCommand movementCommand;

    public MovementCommand getMovementCommand() {
        return movementCommand;
    }

    public void setMovementCommand(MovementCommand movementCommand) {
        this.movementCommand = movementCommand;
    }

    public ChessPiece(Position pos, boolean isAlive, ChessPieceColor color) {
        this.position = pos;
        this.isAlive = isAlive;
        this.color = color;
    }

    public enum ChessPieceColor {
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

    public BoardMediator getBoardMediator() {
        return boardMediator;
    }

    public void setBoardMediator(BoardMediator boardMediator) {
        this.boardMediator = boardMediator;
    }
}
