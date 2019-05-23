package mediator;

import command.PeonMove;
import observer.ActionsObserver;
import observer.KillObserver;
import observer.Observer;
import pieces.ChessPiece;
import pieces.Peon;
import pieces.Position;

import java.util.*;

public class BoardMediator {

    private Map<Position, ChessPiece> boardMap = new HashMap<>();
    private static final int verticalPosMax = 8;
    private static final int horizontalPosMax = 8;
    private List<Observer> obs = new ArrayList<>();

    public void initializeBoard() {
        for(int i=0; i<horizontalPosMax; i++){
            ChessPiece cp = new Peon(0,i,true, ChessPiece.ChessPieceColor.BLACK);
            boardMap.put(cp.getPosition(),cp);
            ChessPiece cp2 = new Peon(verticalPosMax-1,i,true, ChessPiece.ChessPieceColor.WHITE);
            boardMap.put(cp2.getPosition(),cp2);
        }
    }

    public void boardToString() {
        for(int i=0; i<verticalPosMax; i++) {
            for (int j = 0; j<horizontalPosMax; j++) {
                Position currentPosition = new Position(i, j);
                if (boardMap.get(currentPosition) != null) {
                    if (boardMap.get(currentPosition).getColor() == ChessPiece.ChessPieceColor.BLACK) {
                        System.out.print(" B ");
                    } else {
                        System.out.print(" W ");
                    }
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }

    public Position generateRandomPosition(ChessPiece chessPiece) {
        Position currentPosition = chessPiece.getPosition();
        int vertPos = currentPosition.getVertPos(), horizPos = currentPosition.getHorizPos();

//        if(horizPos == 0 || horizPos == 7)
        if (chessPiece.getColor() == ChessPiece.ChessPieceColor.WHITE &&
                vertPos == 0) {
            return currentPosition;
        }

        if (chessPiece.getColor() == ChessPiece.ChessPieceColor.BLACK &&
                vertPos == 7) {
            return currentPosition;
        }

        if (chessPiece.getPosition().getHorizPos() == 0) {
            int nr = new Random().nextInt(1);
            if(nr == 0) {//move forward
                horizPos += 1;
            } else if (nr == 1) { //move forward-right
                horizPos += 1;
                vertPos +=1;
            }
        } else if (chessPiece.getPosition().getHorizPos() == 7){
            int nr = new Random().nextInt(1);
            if(nr == 0) {//move forward
                horizPos += 1;
            } else if (nr == 1) { //move forward-left
                horizPos -= 1;
                vertPos +=1;
            }
        } else {
            int nr = new Random().nextInt(2);
            if(nr == 0) {//move forward
                vertPos += 1;
            } else if (nr == 1) { //move forward-right
                horizPos += 1;
                vertPos +=1;
            } else { //move forward-left
                horizPos -= 1;
                vertPos +=1;
            }
        }

        return new Position(vertPos, horizPos);
    }

    public void move(PeonMove peonMove, Position newPositionOfPiece, ChessPiece chessPiece) {
        boardMap.remove(chessPiece.getPosition());
        peonMove.executeCommand(chessPiece, newPositionOfPiece);
        boardMap.put(newPositionOfPiece, chessPiece);
    }

    public void play() {
        Random generator = new Random();
        Object[] keys = boardMap.keySet().toArray();
        Position randomPosition = (Position)(keys[generator.nextInt(keys.length)]);
        ChessPiece chessPiece = boardMap.get(randomPosition);
        PeonMove peonMove = new PeonMove();

        Position newPositionOfPiece = generateRandomPosition(chessPiece);
        if(chessPiece.getColor() == ChessPiece.ChessPieceColor.WHITE) {
            newPositionOfPiece.setVertPos(newPositionOfPiece.getVertPos()-2);
        }
        if(newPositionOfPiece.getHorizPos() > 7 ||
                newPositionOfPiece.getHorizPos() < 0) {
            newPositionOfPiece = chessPiece.getPosition();
        }

        if(boardMap.get(newPositionOfPiece) != null &&
                boardMap.get(newPositionOfPiece).getColor() != chessPiece.getColor()) {
            notifyObserver(chessPiece, "attack", newPositionOfPiece);
            move(peonMove, newPositionOfPiece, chessPiece);
        } else if (boardMap.get(newPositionOfPiece) != null &&
                boardMap.get(newPositionOfPiece).getColor() == chessPiece.getColor()){
            notifyObserver(chessPiece, "stay", newPositionOfPiece);
        } else {
            notifyObserver(chessPiece, "move", newPositionOfPiece);
            move(peonMove, newPositionOfPiece, chessPiece);
        }
    }

    public void addObserver(Observer observer){
        obs.add(observer);
    }

    public void notifyObserver(ChessPiece cp, String action, Position newPosition){
        for(Observer observer: obs){
            observer.updateObserver(cp, action, newPosition);
        }
    }

    public static void main(String[] args) {
        BoardMediator mediator = new BoardMediator();
        ActionsObserver actionsObserver = new ActionsObserver("Observer 1");
        ActionsObserver actionsObserver1 = new ActionsObserver("Observer 2");
        KillObserver killObserver = new KillObserver();
        mediator.addObserver(actionsObserver);
        mediator.addObserver(actionsObserver1);
        mediator.addObserver(killObserver);
        mediator.initializeBoard();
        mediator.boardToString();

        for (int i=0;i<150;i++) {
            mediator.play();
            mediator.boardToString();
            System.out.println();
        }
    }
}
