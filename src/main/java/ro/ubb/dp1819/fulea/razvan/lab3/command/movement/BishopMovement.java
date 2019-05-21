package ro.ubb.dp1819.fulea.razvan.lab3.command.movement;

public class BishopMovement {
    private int spaces;
    private Direction direction;

    public BishopMovement(int spaces, Direction direction){
        this.spaces = spaces;
        this.direction = direction;
    }

    public enum Direction {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public int getSpaces() {
        return spaces;
    }

    public Direction getDirection() {
        return direction;
    }
}
