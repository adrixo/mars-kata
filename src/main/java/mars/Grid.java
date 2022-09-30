package mars;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    ArrayList<Coordinate> obstacles;

    public Grid() {
        this.obstacles = new ArrayList<>();
    }

    public Coordinate nextCoordinateFor(Coordinate origin, Coordinate vector) {
        int nextX = (origin.x +vector.x) % VAR.GRID_SIZE;
        int nextY = (origin.y +vector.y) % VAR.GRID_SIZE;
        if (nextX<0)
            nextX = VAR.GRID_SIZE-1;
        if (nextY<0)
            nextY = VAR.GRID_SIZE-1;

        Coordinate newCoordinate = new Coordinate(nextX, nextY);
        return obstacles.contains(newCoordinate)
                ? origin
                : newCoordinate;
    }

    public void addObstacleAt(Coordinate obstacle) {
        obstacles.add(obstacle);
    }
}
