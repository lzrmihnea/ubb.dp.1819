package ro.ubb.dp1819.lab3.exercises.command;

import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;
import ro.ubb.dp1819.lab3.exercises.pieces.Position;

interface Command {

    void executeCommand(ChessPiece piece);
}

class PeonCommand implements Command{
    @Override
    public void executeCommand(ChessPiece piece) {
        Position p = piece.getPosition();
        p.setVertPos(piece.getPosition().getVertPos()+1);
        piece.setPosition(p);
    }
}

class HorseCommand implements Command{
    @Override
    public void executeCommand(ChessPiece piece) {
        Position p = piece.getPosition();
        p.setVertPos(piece.getPosition().getVertPos()+2);
        p.setHorizPos(piece.getPosition().getHorizPos()+1);
        piece.setPosition(p);
    }
}

class BishopCommand implements Command{
    @Override
    public void executeCommand(ChessPiece piece) {
        Position p = piece.getPosition();
        p.setVertPos(piece.getPosition().getVertPos()+1);
        p.setHorizPos(piece.getPosition().getHorizPos()+1);
        piece.setPosition(p);
    }
}

class  AttackCommand{

    public void attack(ChessPiece from, ChessPiece to) {
        from.setPosition(to.getPosition());
        to.setAlive(false);

    }
}