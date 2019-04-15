package lab3.mediator;

import lab3.command.*;
import lab3.observer.Observer;
import lab3.pieces.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMediator {

    private Map<ChessPiece, MovementCommand> boardMap = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    public BoardMediator(Map<ChessPiece, MovementCommand> boardMap) {
        this.boardMap = boardMap;
    }

    public Map<ChessPiece, MovementCommand> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<ChessPiece, MovementCommand> boardMap) {
        this.boardMap = boardMap;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public ChessPiece getChessPieceOnPos(Position pos) {
        for(Map.Entry entry: boardMap.entrySet())
            if(((ChessPiece)entry.getKey()).getPosition().equals(pos))
                return (ChessPiece) (entry.getKey());
        return null;
    }
}
