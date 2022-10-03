package mars.widgets;

import mars.MarsRover;
import mars.structures.Coordinate;
import mars.structures.Grid;
import mars.structures.direction.*;

public class GPS {
    private final Grid grid;
    Direction direction;
    Coordinate coordinate;
    // TODO: check optional objects in java (mancuso's video)
    Boolean foundColision = false;

    public GPS(String setupDirection, Grid grid) {
        this.grid = grid;
        String[] args = setupDirection.split(":");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        coordinate = new Coordinate(x, y);
        direction = DirectionFactory.getDirectionFor(args[2]);
    }

    public String getDirection() {
        return direction.asString();
    }

    public void rotateRight() {
        direction = direction.rotateRight();
    }

    public void rotateLeft() {
        direction = direction.rotateLeft();
    }

    public void moveForward() {
        Coordinate vector = direction.moveVector();
        // REF: see comment above
        Coordinate newCoordinate = grid.nextCoordinateFor(coordinate, vector);
        if (coordinate.equals(newCoordinate)) {
            foundColision = true;
        } else {
            foundColision = false;
        }
        coordinate = newCoordinate;
    }

    public int getX() {
        return coordinate.x;
    }

    public int getY() {
        return coordinate.y;
    }

    public String getLocationAsString() {
        String colisionFlag = foundColision
                ? "C:"
                : "";
        return colisionFlag + getX() + ":" + getY() + ":" + getDirection();
    }
}
