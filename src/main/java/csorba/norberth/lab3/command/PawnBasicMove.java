package csorba.norberth.lab3.command;

import csorba.norberth.lab3.pieces.Pawn;
import csorba.norberth.lab3.pieces.Position;

public class PawnBasicMove implements MovementCommand {

    private Pawn pawn;

    public PawnBasicMove(Pawn pawn){
        this.pawn = pawn;
    }

    @Override
    public void move() {
        Position crtPos = pawn.getCurrentPosition();
        pawn.setCrtPosition(new Position(crtPos.y + 1, crtPos.x));
    }
}
