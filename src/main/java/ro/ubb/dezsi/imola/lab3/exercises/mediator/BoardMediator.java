package ro.ubb.dezsi.imola.lab3.exercises.mediator;

import org.springframework.cache.interceptor.BeanFactoryCacheOperationSourceAdvisor;
import ro.ubb.dezsi.imola.lab3.exercises.pieces.*;

import java.util.HashMap;
import java.util.Map;

public class BoardMediator {

    private Map<Position, ChessPiece> boardMap = new HashMap<>();
    public void add(ChessPiece p, Position pos){
        boardMap.put(pos, p);
    }


    public static void main(String[] args) {

        BoardMediator bm = new BoardMediator();

        ChessPiece horseW = new Horse(0, 1, true, ChessPiece.ChessPieceColor.WHITE, bm);
        ChessPiece peonW = new Peon(1, 0, true, ChessPiece.ChessPieceColor.WHITE, bm);
        ChessPiece bishopW = new Bishop(0, 3, true, ChessPiece.ChessPieceColor.WHITE, bm);

        ChessPiece horseB = new Horse(0, 1, true, ChessPiece.ChessPieceColor.BLACK, bm);
        ChessPiece peonB = new Peon(1, 0, true, ChessPiece.ChessPieceColor.BLACK, bm);
        ChessPiece bishopB = new Bishop(0, 3, true, ChessPiece.ChessPieceColor.BLACK, bm);

        bm.add(horseW, horseW.getPosition());
        bm.add(peonW, peonW.getPosition());
        bm.add(bishopW, bishopW.getPosition());

        bm.add(horseB, horseB.getPosition());
        bm.add(peonB, peonB.getPosition());
        bm.add(bishopB, bishopB.getPosition());

    }
}
