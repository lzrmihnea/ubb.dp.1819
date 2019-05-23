import pieces.ChessPiece;

public class KillCounterObserver implements MyObserver {
    private int killCount = 0;

    @Override
    public void update(ChessPiece cp, String action) {
        if(action == "attack"){
            killCount++;
            System.out.println("KILL COUNTER: "+killCount);
        }
    }
}
