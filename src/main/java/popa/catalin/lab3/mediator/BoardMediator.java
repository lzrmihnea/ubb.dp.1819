package popa.catalin.lab3.mediator;

import popa.catalin.lab3.Position;
import popa.catalin.lab3.command.AttackCommand;
import popa.catalin.lab3.observer.AbstractSubject;
import popa.catalin.lab3.observer.CustomObserver;
import popa.catalin.lab3.observer.CustomSubject;
import popa.catalin.lab3.observer.CustomSubjectImpl;
import popa.catalin.lab3.pieces.ChessPiece;

import java.util.HashMap;
import java.util.Map;

public class BoardMediator extends AbstractSubject implements CustomSubject {
    private Map<Position, ChessPiece> boardMap = new HashMap<>();
    private CustomSubjectImpl customSubject = new CustomSubjectImpl();

    public void addPiece(ChessPiece chessPiece) {
        boardMap.put(chessPiece.getPosition(), chessPiece);
        chessPiece.setBoardMediator(this);
    }

    public void movePiece(ChessPiece chessPiece) {
        Position oldPosition = chessPiece.getPosition();
        Position newPosition = chessPiece.getMovementCommand().getResultingPosition(chessPiece);
        if (boardMap.containsKey(newPosition)) {
            ChessPiece attackedPiece = boardMap.get(newPosition);
            AttackCommand.attack(chessPiece, attackedPiece);

            // kill counter
            notifyAllObservers();

            notifyAllObservers(newPosition.toString() + " killed " + oldPosition.toString());
        } else {
            chessPiece.setPosition(newPosition);

            notifyAllObservers(newPosition.toString() + " moved to " + oldPosition.toString());
        }
        boardMap.remove(oldPosition);
        boardMap.put(newPosition, chessPiece);
    }


    @Override
    public void attachObserver(CustomObserver observer) {
        customSubject.attachObserver(observer);
    }

    @Override
    public void notifyAllObservers(String message) {
        customSubject.notifyAllObservers(message);
    }
}
