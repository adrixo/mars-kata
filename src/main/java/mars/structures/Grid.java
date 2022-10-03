package mars;

import java.util.ArrayList;

public class Grid {
    ArrayList<Coordinate> obstacles;

    public Grid() {
        this.obstacles = new ArrayList<>();
    }

    public Coordinate nextCoordinateFor(Coordinate origin, Coordinate vector) {
        Coordinate newCoordinate = origin.sum(vector);
        return obstacles.contains(newCoordinate)
                ? origin
                : newCoordinate;
    }

    public void addObstacleAt(Coordinate obstacle) {
        obstacles.add(obstacle);
    }
}
