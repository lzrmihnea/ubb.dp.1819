package popa.catalin.lab3.pieces;

import popa.catalin.lab3.Position;

public class Bishop extends ChessPiece {
    public Bishop(int vertPos, int horizPos, boolean isAlive, ChessPieceColor color) {
        super(new Position(vertPos, horizPos), isAlive, color);
    }
}
