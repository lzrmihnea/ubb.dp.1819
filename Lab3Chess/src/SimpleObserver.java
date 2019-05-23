import pieces.ChessPiece;

public class SimpleObserver implements MyObserver {

    private String name;

    public SimpleObserver(String name){
        this.name = name;
    }

    @Override
    public void update(ChessPiece cp, String action) {
        System.out.println(name+" observed piece at ("+cp.getPosition().getHorizPos()+", "+cp.getPosition().getVertPos()+")"+action);
    }

    public String getName() {
        return name;
    }
}
