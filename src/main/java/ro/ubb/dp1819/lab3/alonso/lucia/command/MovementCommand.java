package ro.ubb.dp1819.lab3.alonso.lucia.command;

import ro.ubb.dp1819.lab3.alonso.lucia.pieces.ChessPiece;

public interface MovementCommand {

    void executeCommand(ChessPiece piece);
}
