package csorba.norberth.lab3.command;

import csorba.norberth.lab3.pieces.Bishop;
import csorba.norberth.lab3.pieces.Position;

public class BishopDiagonalMove implements MovementCommand {

    private Bishop bishop;

    public BishopDiagonalMove(Bishop bishop){
        this.bishop = bishop;
    }

    @Override
    public void move() {
        Position crtPos = bishop.getCurrentPosition();
        bishop.setCrtPosition(new Position(crtPos.y + 1, crtPos.x + 1));
    }
}
