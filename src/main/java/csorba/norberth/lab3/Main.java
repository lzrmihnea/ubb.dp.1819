package csorba.norberth.lab3;

import csorba.norberth.lab3.mediator.ChessBoard;
import csorba.norberth.lab3.observer.InvalidMoveObserver;
import csorba.norberth.lab3.observer.KillCounterObserver;
import csorba.norberth.lab3.observer.PrintObserver;
import csorba.norberth.lab3.pieces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ChessPiece> chessPieces = getChessPieces();
        ChessBoard chessBoard = new ChessBoard(20, 20, chessPieces);
        chessBoard.getKillEvent().addListener(new KillCounterObserver());
        chessBoard.getMoveEvent().addListener(new PrintObserver());
        chessBoard.getInvalidMoveEvent().addListener(new InvalidMoveObserver());

        Thread commandPatterClientThread = new Thread(() -> {
            try{
                Random random = new Random(1);
                while (true) {
                    double index = random.nextDouble() * chessPieces.size();
                    ChessPiece randomChosenPiece = chessPieces.get((int)index);
                    if(!randomChosenPiece.isAlive()){
                        continue;
                    }
                    chessBoard.scheduleMovement(randomChosenPiece.getPossibleMove());
                    Thread.sleep(200);
                }
            }catch (InterruptedException ex){
                System.out.println("finished");
            }
        });
        commandPatterClientThread.start();
        chessBoard.beginGame();

        try {
            Thread.sleep(10000);
            commandPatterClientThread.interrupt();
            chessBoard.endGame();
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    private static List<ChessPiece> getChessPieces() {
        List<ChessPiece> chessPieces = new ArrayList<>();

        chessPieces.add(new Pawn(ChessPieceColor.WHITE, new Position(0, 0)));
        chessPieces.add(new Pawn(ChessPieceColor.BLACK, new Position(1, 0)));
        chessPieces.add(new Knight(ChessPieceColor.BLACK, new Position(1, 4)));
        chessPieces.add(new Knight(ChessPieceColor.WHITE, new Position(3, 3)));
        chessPieces.add(new Bishop(ChessPieceColor.WHITE, new Position(1, 1)));
        chessPieces.add(new Bishop(ChessPieceColor.BLACK, new Position(2, 2)));

        return chessPieces;
    }
}
