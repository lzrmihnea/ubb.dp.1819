package ro.ubb.dp1819.lab3.exercises.mediator;

import ro.ubb.dp1819.lab3.exercises.command.*;
import ro.ubb.dp1819.lab3.exercises.observer.KillCountObserver;
import ro.ubb.dp1819.lab3.exercises.observer.PrintObserver;
import ro.ubb.dp1819.lab3.exercises.observer.StatsObserver;
import ro.ubb.dp1819.lab3.exercises.pieces.*;
import ro.ubb.dp1819.lab3.exercises.observer.Observer;

import java.util.*;

public class BoardMediator {

    private Map<Position, ChessPiece> boardMap = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    public void start() {
        initWhitePieces();
        initBlackPieces();

        new KillCountObserver(this);
        new PrintObserver(this);
        new StatsObserver(this);
        notifyAllObservers();

        MovementCommand command = new MovePeon(MovePeon.PeonDir.Up);
        command.executeCommand(this.boardMap.get(new Position(2,3)));
        ChessPiece piece = checkIfExists(this.boardMap.get(new Position(2,3)));
        if (piece != null){
            AttackCommand attack = new AttackCommand();
            attack.executeCommand(this.boardMap.get(new Position(2,3)),piece);
        }
        notifyAllObservers();

        MovementCommand command1 = new MovePeon(MovePeon.PeonDir.Up);
        command1.executeCommand(this.boardMap.get(new Position(2,3)));
        piece = checkIfExists(this.boardMap.get(new Position(2,3)));
        if (piece != null){
            AttackCommand attack = new AttackCommand();
            attack.executeCommand(this.boardMap.get(new Position(2,3)),piece);
        }
        notifyAllObservers();

        MovementCommand command2 = new MovePeon(MovePeon.PeonDir.Down);
        command2.executeCommand(this.boardMap.get(new Position(4,2)));
        piece = checkIfExists(this.boardMap.get(new Position(4,2)));
        if (piece != null){
            AttackCommand attack = new AttackCommand();
            attack.executeCommand(this.boardMap.get(new Position(4,2)),piece);
        }
        notifyAllObservers();

        MovementCommand command3 = new MovePeon(MovePeon.PeonDir.Down);
        command3.executeCommand(this.boardMap.get( new Position(4,2)));
        piece = checkIfExists(this.boardMap.get( new Position(4,2)));
        if (piece != null){
            AttackCommand attack = new AttackCommand();
            attack.executeCommand(this.boardMap.get( new Position(4,2)),piece);
        }
        notifyAllObservers();

        MovementCommand command4 = new MoveBishop(1,MoveBishop.BishopDir.DownRight);
        command4.executeCommand(this.boardMap.get( new Position(1,1)));
        piece = checkIfExists(this.boardMap.get( new Position(1,1)));
        if (piece != null){
            AttackCommand attack = new AttackCommand();
            attack.executeCommand(this.boardMap.get( new Position(1,1)),piece);
        }
        notifyAllObservers();
    }

    public void attach(Observer observer) {
            this.observers.add(observer);
    }
    public void notifyAllObservers() {
        this.observers.forEach(o -> o.update());
    }
    public Map<Position, ChessPiece> getBoardMap() {
        return boardMap;
    }
    public void setBoardMap(Map<Position, ChessPiece> boardMap) {
        this.boardMap = boardMap;
    }

    public ChessPiece checkIfExists(ChessPiece piece){
        Optional<Map.Entry<Position, ChessPiece>> pieceMap = this.boardMap.entrySet().stream()
                .filter(e -> e.getValue().getPosition().getVertPos() == piece.getPosition().getVertPos() &&
                e.getValue().getPosition().getHorizPos() == piece.getPosition().getHorizPos() &&
                !e.getValue().getColor().equals(piece.getColor())).findFirst();
        return pieceMap.map(Map.Entry::getValue).orElse(null);
    }

    private void initWhitePieces() {
        Position wpos1 = new Position(1,3);
        Position wpos2 = new Position(1,2);
        Position wpos7 = new Position(1,1);
        Position wpos3 = new Position(1,4);
        Position wpos4 = new Position(2,3);
        Position wpos5 = new Position(2,2);
        Position wpos6 = new Position(2,4);
        Position wpos8 = new Position(2,1);

        ChessPiece whitePeon1 = new Peon(wpos4.getVertPos(),wpos4.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whitePeon2 = new Peon(wpos5.getVertPos(),wpos5.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whitePeon3 = new Peon(wpos6.getVertPos(),wpos6.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whitePeon4 = new Horse(wpos8.getVertPos(),wpos8.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whiteHorse1 = new Horse(wpos1.getVertPos(),wpos1.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whiteHorse2 = new Horse(wpos2.getVertPos(),wpos2.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whiteBishop2 = new Horse(wpos3.getVertPos(),wpos3.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);
        ChessPiece whiteBishop1 = new Bishop(wpos7.getVertPos(),wpos7.getHorizPos(),true,ChessPiece.ChessPieceColor.WHITE);

        this.boardMap.put(wpos1,whiteHorse1);
        this.boardMap.put(wpos7,whiteBishop1);
        this.boardMap.put(wpos2,whiteHorse2);
        this.boardMap.put(wpos4,whitePeon1);
        this.boardMap.put(wpos5,whitePeon2);
        this.boardMap.put(wpos6,whitePeon3);
        this.boardMap.put(wpos8,whitePeon4);
        this.boardMap.put(wpos3,whiteBishop2);
    }

    private void initBlackPieces() {
        Position bpos1 = new Position(5,3);
        Position bpos2 = new Position(5,2);
        Position bpos7 = new Position(5,1);
        Position bpos3 = new Position(5,4);
        Position bpos4 = new Position(4,3);
        Position bpos5 = new Position(4,2);
        Position bpos6 = new Position(4,4);
        Position bpos8 = new Position(4,1);

        ChessPiece blackPeon1 = new Peon(bpos4.getVertPos(),bpos4.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackPeon2 = new Peon(bpos5.getVertPos(),bpos5.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackPeon3 = new Peon(bpos6.getVertPos(),bpos6.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackPeon4 = new Peon(bpos8.getVertPos(),bpos8.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackHorse1 = new Horse(bpos1.getVertPos(),bpos1.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackHorse2 = new Horse(bpos2.getVertPos(),bpos2.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackBishop1 = new Bishop(bpos3.getVertPos(),bpos3.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);
        ChessPiece blackBishop2 = new Bishop(bpos7.getVertPos(),bpos7.getHorizPos(),true,ChessPiece.ChessPieceColor.BLACK);

        this.boardMap.put(bpos1,blackHorse1);
        this.boardMap.put(bpos3,blackBishop1);
        this.boardMap.put(bpos2,blackHorse2);
        this.boardMap.put(bpos4,blackPeon1);
        this.boardMap.put(bpos5,blackPeon2);
        this.boardMap.put(bpos6,blackPeon3);
        this.boardMap.put(bpos8,blackPeon4);
        this.boardMap.put(bpos7,blackBishop2);
    }
}
