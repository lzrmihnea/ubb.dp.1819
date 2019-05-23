import movement.MovePeon;
import pieces.ChessPiece;
import pieces.Peon;
import pieces.Position;

import java.util.*;

public class BoardMediator {

    private Map<Position, ChessPiece> boardMap = new HashMap<>();
    private static final int vertMax = 10;
    private static final int horizMax = 10;
    private List<MyObserver> observers = new ArrayList<>();

    public void initializeBoard(){
        for(int i=0; i<horizMax; i++){
            if(i%2 == 0){
                ChessPiece cp = new Peon(0,i,true, ChessPiece.ChessPieceColor.BLACK);
                boardMap.put(cp.getPosition(),cp);
            }else {
                ChessPiece cp = new Peon(vertMax,i,true, ChessPiece.ChessPieceColor.WHITE);
                boardMap.put(cp.getPosition(),cp);
            }
        }
    }

    public boolean isAttack(Position pos){
        return (boardMap.get(pos) != null);
    }

    public boolean isInsideBoard(Position pos){
        return (pos.getHorizPos() <= horizMax && pos.getVertPos() <= vertMax && pos.getVertPos() >=0 && pos.getHorizPos() >= 0);
    }

    public void play() {
        MovePeon mpU = new MovePeon("up");
        MovePeon mpUR = new MovePeon("up-right");
        MovePeon mpUL = new MovePeon("up-left");
        Random rand  = new Random();
        ArrayList<ChessPiece> cpieces = new ArrayList<>(boardMap.values());
        for(ChessPiece cp : cpieces){
            int movement = rand.nextInt(2);
            switch (movement) {
                case 1:
                    Position futureR = mpUR.getFuturePosition(cp);
                    Position futureL = mpUL.getFuturePosition(cp);
                    Position future = mpU.getFuturePosition(cp);
                    if(isAttack(futureR)){
                        boardMap.remove(cp.getPosition());
                        notifyMovement(cp, "attack");
                        mpUR.executeCommand(cp);
                        boardMap.put(futureR, cp);
                    } else if(isAttack(futureL)){
                        boardMap.remove(cp.getPosition());
                        notifyMovement(cp, "attack");
                        mpUL.executeCommand(cp);
                        boardMap.put(futureL, cp);
                    } else {
                        if(isInsideBoard(future) && !isAttack(future)){
                            boardMap.remove(cp.getPosition());
                            notifyMovement(cp, "move forward");
                            mpU.executeCommand(cp);
                            boardMap.put(future, cp);
                        }
                    }
                    break;
                case 2:
                    //skip piece
                    break;
            }
        }
    }

    public int piecesOnBoard() {
        return boardMap.values().size();
    }

    public void printBoard() {
        System.out.println("____________________");
        for(int i=0; i<=vertMax; i++){
            for(int j=0; j<=horizMax; j++){
                Position currP = new Position(i,j);
                if(boardMap.get(currP) != null){
                    if(boardMap.get(currP).getColor() == ChessPiece.ChessPieceColor.BLACK){
                        System.out.print(" B ");
                    } else {
                        System.out.print(" W ");
                    }
                } else {
                    System.out.print(" _ ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
    }

    public void addObserver(MyObserver obs){
        observers.add(obs);
    }

    public void notifyMovement(ChessPiece cp, String action){
        for(MyObserver obs: observers){
            obs.update(cp, action);
        }
    }


    public static void main(String[] args) {
        BoardMediator bm = new BoardMediator();
        SimpleObserver sObs1 = new SimpleObserver("Dorel");
        SimpleObserver sObs2 = new SimpleObserver("Petre");
        KillCounterObserver kObs = new KillCounterObserver();
        bm.addObserver(sObs1); bm.addObserver(sObs2); bm.addObserver(kObs);
        bm.initializeBoard();
        bm.printBoard();
        int round = 1;
//        bm.play();
//        bm.printBoard();
        for(int i=0; i<20; i++) {
            bm.play();
            System.out.println("After round " + round);
            bm.printBoard();
            round++;
        }
    }
}
