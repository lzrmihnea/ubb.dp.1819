package popa.catalin.lab3.pieces;

import popa.catalin.lab3.Position;

public class Horse extends ChessPiece {
    public Horse(int vertPos, int horizPos, boolean isAlive, ChessPieceColor color) {
        super(new Position(vertPos,horizPos), isAlive, color);
    }
}
