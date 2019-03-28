package csorba.norberth.lab3.command;

import csorba.norberth.lab3.pieces.Knight;
import csorba.norberth.lab3.pieces.Position;

public class KnightLMove implements MovementCommand {

    private Knight knight;

    public KnightLMove(Knight knight){
        this.knight = knight;
    }

    @Override
    public void move() {
        Position crtPos = knight.getCurrentPosition();
        knight.setCrtPosition(new Position(crtPos.y + 2, crtPos.x + 1));
    }
}
