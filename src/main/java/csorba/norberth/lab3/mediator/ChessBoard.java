package csorba.norberth.lab3.mediator;

import csorba.norberth.lab3.command.MovementCommand;
import csorba.norberth.lab3.observer.Observer;
import csorba.norberth.lab3.pieces.ChessPiece;
import csorba.norberth.lab3.pieces.Position;

import java.util.*;

public class ChessBoard {

    private int n, m;
    private HashMap<Position, ChessPiece> board = new HashMap<>();
    private final Queue<MovementCommand> futureMoves = new ArrayDeque<>();
    private Thread thread;
    private Event<Void> killEvent = new Event<>();
    private Event<Void> moveEvent = new Event<>();
    private Event<Void> invalidMoveEvent = new Event<>();

    public ChessBoard(int n, int m, Collection<ChessPiece> pieces) {
        this.n = n;
        this.m = m;
        pieces.forEach(piece -> board.put(piece.getCurrentPosition(), piece));
    }

    public Event<Void> getKillEvent() {
        return killEvent;
    }

    public Event<Void> getMoveEvent() {
        return moveEvent;
    }

    public Event<Void> getInvalidMoveEvent() {
        return invalidMoveEvent;
    }

    public void beginGame() {
        if (thread == null) {
            thread = new Thread(() -> {
                try {
                    while (true) {
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                        mediate();
                        Thread.sleep(300);
                    }
                } catch (InterruptedException ex) {
                    System.out.println("game ended");
                }
            });
            thread.start();
        }
    }

    public void endGame() {
        thread.interrupt();
        try {
            thread.join();
            thread = null;
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void scheduleMovement(MovementCommand movement) {
        synchronized (futureMoves) {
            futureMoves.add(movement);
        }
    }

    private void mediate() {
        synchronized (futureMoves) {
            while (!futureMoves.isEmpty()) {
                futureMoves.remove().move();
                for(Position pos : board.keySet()){
                    if(board.get(pos) != null && !board.get(pos).getCurrentPosition().equals(pos)){
                        ChessPiece pieceToMove = board.get(pos);
                        boolean moveSucceeded = tryMove(pieceToMove);
                        if(moveSucceeded){
                            board.put(pos, null);
                        }else {
                            pieceToMove.setCrtPosition(pos);
                        }
                        break;
                    }
                }
            }
        }
    }

    private boolean tryMove(ChessPiece piece){
        Position destination = piece.getCurrentPosition();
        if(destination.y >= this.n || destination.y < 0 || destination.x >= this.m || destination.x < 0){
            invalidMoveEvent.fire(null);
            return false;
        }
        ChessPiece pieceAtDestination = board.get(destination);
        if(pieceAtDestination != null && pieceAtDestination.getColor().equals(piece.getColor())){
            invalidMoveEvent.fire(null);
            return false;
        }
        if(pieceAtDestination != null){
            pieceAtDestination.setAlive(false);
            killEvent.fire(null);
        }
        board.put(piece.getCurrentPosition(), piece);
        moveEvent.fire(null);
        return true;
    }

    public static class Event<TArgs>{

        private Collection<Observer<TArgs>> listeners = new ArrayList<>();

        public void addListener(Observer<TArgs> listener) {
            listeners.add(listener);
        }

        private void fire(TArgs args){
            listeners.forEach(listener -> listener.update(args));
        }
    }

}
