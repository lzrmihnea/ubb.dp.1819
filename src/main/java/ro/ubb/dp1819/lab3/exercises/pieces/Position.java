package ro.ubb.dp1819.lab3.exercises.pieces;

import java.util.Objects;

public class Position {
    private int vertPos;
    private int horizPos;

    public Position(int vertPos, int horizPos) {
        this.vertPos = vertPos;
        this.horizPos = horizPos;
    }

    public int getVertPos() {
        return vertPos;
    }

    public void setVertPos(int vertPos) {
        this.vertPos = vertPos;
    }

    public int getHorizPos() {
        return horizPos;
    }

    public void setHorizPos(int horizPos) {
        this.horizPos = horizPos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return vertPos == position.vertPos &&
                horizPos == position.horizPos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertPos, horizPos);
    }
}
