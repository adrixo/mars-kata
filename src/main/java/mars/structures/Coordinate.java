package mars.structures;

import java.util.Objects;

public class Coordinate {
    public final int x;
    public final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate sum(Coordinate vector) {
        int nextX = (x + vector.x) % VAR.GRID_SIZE;
        int nextY = (y + vector.y) % VAR.GRID_SIZE;
        if (nextX<0)
            nextX = VAR.GRID_SIZE-1;
        if (nextY<0)
            nextY = VAR.GRID_SIZE-1;

        Coordinate newCoordinate = new Coordinate(nextX, nextY);
        return newCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
