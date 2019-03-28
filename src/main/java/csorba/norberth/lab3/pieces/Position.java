package csorba.norberth.lab3.pieces;

public final class Position {
    public final int y;
    public final int x;

    public Position(int y, int x){
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position)){
            return false;
        }
        Position that = (Position) obj;
        return this.y == that.y && this.x == that.x;
    }

    @Override
    public int hashCode() {
        return y + x;
    }
}
