package ro.ubb.dezsi.imola.lab3.exercises.command;

import ro.ubb.dezsi.imola.lab3.exercises.pieces.ChessPiece;

public interface MovementCommand {

    void executeCommand(ChessPiece piece);
}
