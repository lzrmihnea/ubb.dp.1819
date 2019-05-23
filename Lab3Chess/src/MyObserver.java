import pieces.ChessPiece;

public interface MyObserver {
    void update(ChessPiece cp, String action);
}
