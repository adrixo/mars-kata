package mars;

public class Grid {
    public static Coordinate nextCoordinateFor(Coordinate origin, Coordinate vector) {
        int nextX = (origin.x +vector.x) % VAR.GRID_SIZE;
        int nextY = (origin.y +vector.y) % VAR.GRID_SIZE;
        if (nextX<0)
            nextX = VAR.GRID_SIZE-1;
        if (nextY<0)
            nextY = VAR.GRID_SIZE-1;
        return new Coordinate(nextX, nextY);
    }
}
