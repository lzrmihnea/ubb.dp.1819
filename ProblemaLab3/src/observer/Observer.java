package observer;

import pieces.ChessPiece;
import pieces.Position;

public interface Observer {
    void updateObserver(ChessPiece chessPiece, String action, Position newPosition);
}
