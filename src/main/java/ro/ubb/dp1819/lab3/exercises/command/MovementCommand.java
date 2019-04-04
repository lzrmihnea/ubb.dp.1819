package ro.ubb.dp1819.lab3.exercises.command;

import ro.ubb.dp1819.lab3.exercises.pieces.ChessPiece;

public interface MovementCommand {

    void executeCommand(ChessPiece piece);
}
