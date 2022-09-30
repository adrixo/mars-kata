package mars;

import mars.direction.*;

public class GPS {
    private final Grid grid;
    Direction direction;
    Coordinate coordinate;

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
        coordinate = Grid.nextCoordinateFor(coordinate, vector);
    }

    public int getX() {
        return coordinate.x;
    }

    public int getY() {
        return coordinate.y;
    }
}
