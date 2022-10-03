package mars.widgets;

import mars.MarsRover;
import mars.structures.Coordinate;
import mars.structures.Grid;
import mars.structures.direction.*;

public class GPS {
    public final Grid grid;
    public Direction direction;
    public Coordinate coordinate;
    // TODO: check optional objects in java (mancuso's video)
    public Boolean foundColision = false;

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
